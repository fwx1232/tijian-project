import { createRouter, createWebHashHistory } from 'vue-router'
import Login from '../views/Login.vue'
import OrdersList from '../views/OrdersList.vue'
import OrdersContent from '../views/OrdersContent.vue'

const routes = [
  {
    path: '/',
    name: 'home',
    component: Login
  }
]

const router = createRouter({
  history: createWebHashHistory(),
  routes
})

export default router
