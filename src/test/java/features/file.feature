Feature: Application Login

Scenario: Verification of Application

Given visiting homepage of "https://secure.education.mn.gov/cas/login?service=https%3a%2f%2fsecure.education.mn.gov%2ftestwes%2findex.faces" website
When entering credentials "y.ogurlu" and "12345" to log in
Then read the "Test message" from console
And verify the message "true"


Given visiting homepage of "https://secure.education.mn.gov/cas/login?service=https%3a%2f%2fsecure.education.mn.gov%2ftestwes%2findex.faces" website
When entering credentials "Elif Brucu" and "Burcum Kizim" to log in
Then read the "Test message is different" from console
And verify the message "false"