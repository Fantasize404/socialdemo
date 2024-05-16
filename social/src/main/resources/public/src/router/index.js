import { createRouter, createWebHistory } from 'vue-router'
import Login from '../views/Login.vue'
import Register from '../views/Register.vue'
import Article from '../views/Article.vue'
import Insert from '../views/Insert.vue'
import Edit from '../views/Edit.vue'

const router = createRouter({
  history: createWebHistory(import.meta.env.BASE_URL),
  routes: [
    {
      path: '/',
      name: 'Login',
      component: Login
    },
    {
      path: '/Register',
      name: 'Register',
      component: Register
    },
    {
      path: '/article',
      name: 'Article',
      component: Article
    },
    {
      path: '/insert',
      name: 'Insert',
      component: Insert
    },
    {
      path: '/edit',
      name: 'Edit',
      component: Edit
    }
  ]
})

export default router
