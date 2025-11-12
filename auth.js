// frontend/auth.js
const DEMO_USER = { username: 'admin', password: 'admin123' };

function login(username, password) {
  if (username === DEMO_USER.username && password === DEMO_USER.password) {
    localStorage.setItem('auth', JSON.stringify({ user: username, ts: Date.now() }));
    return true;
  }
  return false;
}

function isAuthenticated() {
  const auth = localStorage.getItem('auth');
  return !!auth;
}

function logout() {
  localStorage.removeItem('auth');
}
