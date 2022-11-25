@Auth
Feature: Auth

# registrasi
  #Scenario Outline: User create new account
    #Given I open Website
    #When I click icon registrasi
    #And I fill correct fullname <fullname> gender <gender> email <email> password <password> and konfirmasipassword <konfirmasipassword>
    #And I click register button
    #And I agree with terms and conditions
    #Then I in homepage
#
    #Examples: 
      #| fullname | email             | password   |
      #| Nessie3  | nessie3@gmail.com | nessie3aja |
      #|          | nessie3@gmail.com | nessie3aja |

# login
  #Scenario Outline: User log in into website using existing acount
    #Given I open Website
    #When I click icon login
    #And I fill correct email <email> and password <password>
    #And I click login button
    #Then I in homepage
#
    #Examples: 
      #| email          | password |
      #| olaf@gmail.com | olafaja  |

# logout
  #Scenario Outline: User logout
    #Given I open Website
    #When I click icon login
    #And I fill correct email <email> and password <password>
    #And I click login button
    #And I in homepage
    #And I click icon logout
    #Then I logout
#
    #Examples: 
      #| email          | password |
      #| olaf@gmail.com | olafaja  |
