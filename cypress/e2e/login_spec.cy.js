describe('Bộ kiểm thử chức năng Đăng nhập', () => {

  // Lệnh này sẽ chạy trước TỪNG bài test bên dưới
  beforeEach(() => {
    cy.visit('https://www.saucedemo.com');
  });

  it('Kịch bản 1: Đăng nhập thành công với tài khoản hợp lệ', () => {
    cy.get('#user-name').type('standard_user');
    cy.get('#password').type('secret_sauce');
    cy.get('#login-button').click();
    cy.url().should('include', '/inventory.html');
  });

  it('Kịch bản 2: Hiển thị lỗi khi đăng nhập sai thông tin', () => {
    cy.get('#user-name').type('invalid_user');
    cy.get('#password').type('wrong_password');
    cy.get('#login-button').click();
    
    // Kiểm tra thông báo lỗi hiển thị
    cy.get('.error-message-container')
      .should('be.visible')
      .and('contain', 'Epic sadface: Username and password do not match any user in this service');
  });
});