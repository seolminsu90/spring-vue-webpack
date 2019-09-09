<template>
  <div class="hello">
    <h1>{{ msg }}</h1>
  </div>
</template>

<script>
export default {
  name: 'Item',
  data () {
    return {
      msg: 'Thie route component is ITEM'
    }
  }
}
</script>

<style scoped>
h1, h2 {
  font-weight: normal;
  color: red;
}
</style>
