**web-automation**

This is the web test automation project for testing. It was built using Java 8, Selenium 3, Cucumber and Selenide frameworks [http://selenide.org/index.html ].

**Features**

The project has three feature files which represent the following scenarios:
1. Login:
-Login with valid user credentials;
-Login with wrong username and correct password;
-Login with wrong password and correct username.
2. Hover:
-Hover over the profile pictures and verify, that displayed user information is according to the user.
3.Sortable data table
   ---

Feature files location:
src/test/resources/com.company/

**Prerequisites Software/Tools**

1. Java Development Kit (Java 8)
2. Java Runtime Environment
3. Maven [ http://maven.apache.org/ ]
4. Git [ http://git-scm.com/downloads ]
5. Chrome browser

**Installation/Running Tests**

git clone https://github.com/mariajanzen/Quandoo-candidate-test.git

cd Quandoo-candidate-test/

mvn test
