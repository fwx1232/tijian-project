import { createRouter, createWebHashHistory } from 'vue-router'
import Login from '../views/Login.vue'
import Register from '../views/Register.vue'
import Index from '../views/Index.vue'
import Appointment from '../views/Appointment.vue'
import ReportList from '../views/ReportList.vue'
import Personal from '../views/Personal.vue'
import Hospital from '../views/Hospital.vue'
import Setmeal from '../views/Setmeal.vue'
import SelectDate from '../views/SelectDate.vue'
import ConfirmOrder from '../views/ConfirmOrder.vue'
import AppointmentSuccess from '../views/AppointmentSuccess.vue'
import AppointmentList from '../views/AppointmentList.vue'
import Report from '../views/Report.vue'

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
