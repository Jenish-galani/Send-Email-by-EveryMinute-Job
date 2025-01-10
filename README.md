# 📧 Spring Boot Email Scheduler

# 🛠️ Features:
  
- Automates email sending every minute ⏳.
- Uses Spring Boot 🐾 and Java ☕.
- Integrates with an email service (e.g., Gmail SMTP ✉️).
- Supports rich email content (plain text, HTML, attachments 📎).

# Technologies Used:

- 🖥️ Spring Boot
- 💾 MySQL
- 📜 JavaMail API
- ⚙️ Spring Task Scheduler

# 🌟 Key Steps:
# 📦 Add Dependencies:

- Include spring-boot-starter-mail in your pom.xml for email support.
- Use spring-boot-starter for core functionality.

# ⚙️ Configure Email Settings:

- Add SMTP server details (e.g., Gmail, Outlook) in application.properties:
- properties
- spring.mail.host=smtp.gmail.com
- spring.mail.port=587
- spring.mail.username=your-email@example.com
- spring.mail.password=your-password
- spring.mail.properties.mail.smtp.auth=true
- spring.mail.properties.mail.smtp.starttls.enable=true

# ✅ Testing:
- Run your application 🎯.
- Verify that emails are sent every minute ⏳ to the recipient.

