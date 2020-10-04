# Test - Assignment 2 
[Assignment Link](https://app.peergrade.io/assignment/caf82028-e3c5-4dc1-b7ba-92e588bc7c51/attachment)   
  
  
## Reflections  
  
  
### Computer Mouse 
**Identify the types of testing you would perform on a computer mouse, to make sure that it is of the highest quality.**  

1. Does the mouse detects movement correctly (on the X and Y axis).
2. Stresstest all the buttons and see if they still works after a thousand clicks on each button.
3. Does the scroll-wheel still work after continious stress testing and after scrolling for X-amount of miles. 
4. Does the scroll-wheel detect clicks when pressing down on the wheel.
5. Is the mouse cabable of detecting click and movement at the same time.
6. Is the mouse cabable of detecting scroll and movement at the same time.
  
  
### Catastrophe failure
**Find a story where a software system defect had a bad outcome. Describe what happened. Can you identify a test that would have prevented it?**  
```
Two years ago a well-known code collaboration platform GitLab experienced a severe data loss which appeared to be one of the major outages in the IT world. GitLab originally used only one database server but decided to test a solution using two servers. They planned to copy the data from the production environment to the test environment.

In the process, the automatic mechanisms began to remove accounts from the database which were identified as dangerous. As a result of increased traffic, the data copying process began to slow down and then stopped completely due to data discrepancies. To add insult to injury, information from the production database was removed during the copying process.

After several attempts to resume the process, one of the employees decided to delete the test base and start the process again but accidentally deleted the production base. What made things even worse is that the directory holding the copies was empty too — the backups had not been made for a long time due to a configuration error.

What meant to be a standard procedure resulted in an 18-hour outage while the 300 GB of customer data was lost. According to the GitLab’s estimates, the company has lost data on at least 5,000 new projects, 5,000 comments, and 700 users. The company approach to this failure deserves respect.

Gitlab explained in detail what happened, broadcasted the restoration procedure on YouTube and published a list of improvements to ensure that this trouble would never happen again. But as they say — the damage is done.
```
I would have make the process automatic instead of manual, and then added a test to the function that would run on a mock database to see if the copying of data happened the way it should without any failure before even considering using it on the production environment.
  

#Investigation Tools
## JUnit 5
**Investigate JUnit 5 (Jupiter). Explain the following, and how they are useful:**
| Annotations       | Usage                                                             |
| -------------     |-------------------------------------------                        |
| **@Tag**          | Used to tag classes for filtering                                 |
| **@Disabled**     | Used to disable a test class or method                            |
| **@RepeatedTest**  | Indicates that a method is a test template for a repeated class   |
| **@BeforeEach, @AfterEach** | **BeforeEach** should be executed before each **@Test**. **AfterEach** should be executed after each **@Test** |
| **@DisplayName** | Used for defining a custom display name for the test class or method |
| **@Nested** | Indicates that the class is a non-static nested test class |
| **assumeFalse, assumeTrue** | **assumeTrue()** If called with an expression evaluating to false, the test will halt and be ignored. **assumeFalse()** is the inverse of **assumeTrue()** |

## Mocking Frameworks
**Investigate mocking frameworks for your preferred language. Choose at least
two frameworks, and answer the questions. (One could be Mockito, which
we saw in class.)**  
**What are their similarities?**  
**What are their differences?**  
**Which one would you prefer, if any, and why?**  


