import Vue from 'vue'
import Vuex from 'vuex'

Vue.use(Vuex)

export default new Vuex.Store({
  name: 'Store',
  state: {
    count: 0
  },
  mutations: {
    increment (state) {
      state.count++
    }
  }
})
