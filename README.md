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
In 2018, Hawaii accidentally broadcasted a country-wide MISSLILE-EMERGENCY-ALERT due to a poorly designed software interface.
![alt text](https://www.experience-lab.com/wp-content/uploads/2018/02/1g8apgO_BtMFaH_RC-W5jPw-600x450.jpg)


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


