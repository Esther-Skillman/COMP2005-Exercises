# COMP2005-Exercises
## Terms
- Cognitive load: How much the user has to use their cognitive ability to interact with a UI, the less the better and can be identified through a cognitive walkthrough.
- Design lock-in: when a developer has a personal connection to a prototype they spent time on, adding complications when it must be scrapped or altered. (highlights the advantage of paper-based prototyping - less time and easily altered)
- Test-Driven Development (TDD): is the process of developing and running automated test before actual development of the application. To perform a TDD, write the tests, then write the smallest amount of code necessary to make the tests pass. (Resisting the urge to write more code.)
- Unit Testing: Each part of the system is tested individually so the test scope is much smaller and errors are isolated and detected earlier through either state-based testing (if it produces expected result) or INteraction-based testing (how the result was achieved)
- Mock objects: used when real objects could be hard to trigger, is slow or does not yet exist for example.
- User personas: Profiles of a UI's target audience to provide clear definitons fo a target audience's goals and contexts, helping evaluators see things from the user's perspectives.

## Session 2
### Principles of SW Testing
1) Testing shows presence of defects, not absence
2) Exhaustive testing not possible
3) Early testing saves time + money
4) Defects cluster together
5) Testing is context-dependent
6) Beware of the pesticide paradox
7) Error Absence - fallacy
### Testing categories
- Static Testing: software tested without code execution review performed - eliminate errors or ambiguities in requirements or design - code review analysis to find structural defects (e.g., a variable with an undefined value)
- Dynamic Testing software tested after code execution - check for functional behaviour (& non-functional requirements) against predefined SW requirements
- Black-Box Testing:  It is a type of dynamic testing where the internal structure is NOT known to the tester. Therefore, it is only concerned with the system functionality.
- White-Box Testing: It is a type of testing where the internal structure is known to the tester. Therefore, explicit paths through the system can be tested (code coverage).
- Gray-Box Testing: It is a combination of white-box testing and black-box testing.

## Session 3 
### Unit Testing - Arrange, Act, Assert (AAA) Approach
Determine data needed
Arrange: Set up the unit to be tested
Act: Call unit to be tested
Assert: Check that actual outcome matches expected
Analyse Test results

### Unit Testing - Right BICEP
- Boundary conditions of inputs correct?
- Inverse relationships checked?
- Cross check results using other means?
- Error conditions tested (forced to occur)? Code robust to:
• out of range values
• out of memory, high
• system load, etc.
- Performance characteristics within bounds (NFRs)? does performance change as input size grows?

## Session 4
### Jacob Nielsen's Heuristics Rules
1) Visibility of system status
2) Match between sytem and the real world (for example: is red and green interpreted the same in all industries?)
3) User control and freedom (support undo and redo)
4) Consistency and standards (avoid increasing user's cognitive load)
5) Error prevention
6) Recognition rather than recall in User Interfaces (more cues = easier to retrieve from memory)
7) Flexibility and Efficiency of Use
8) Aesthetic and Minimalist Design (communicate; dont decorate)
9) Help users recognize, diagnose, and recover from errors
10) Help and documentation

