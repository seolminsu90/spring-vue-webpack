<template>
  <div id="app">
    <p>{{message}}</p>
    <ul>
      <li v-on:click="movePage('User')">User</li>
      <li><router-link v-bind:to="{ name: 'Item' }">Item</router-link></li>
    </ul>
    <p v-on:click="getRequest">Greeting !</p>
    <router-view/>
  </div>
</template>

<script>
import axios from 'axios'

export default {
  name: 'App',
  methods: {
    movePage: function(page){
      this.$router.push(page)
    },
    getRequest: function(){
      axios.get('/api/greeting').then(res => { alert(res.data) })
    }
  },
  data () {
    return {
      message: 'Hello My Test. click item.'
    }
  }
}
</script>

<style>
#app {
  font-family: 'Avenir', Helvetica, Arial, sans-serif;
  -webkit-font-smoothing: antialiased;
  -moz-osx-font-smoothing: grayscale;
  text-align: center;
  color: #2c3e50;
  margin-top: 60px;
}

p {
  font-size : 30px;
}
li {
  list-style: none;
  cursor:pointer;
  font-size:20px;
}
</style>
