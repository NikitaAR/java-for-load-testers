# Java for Load Testers Training #jet-infosystems
40 hrs.

# Objectives
- Know Java application corner cases for effective testing
- Develop Java-based load tests
 
# Agenda
## Java platform intro (1 hrs / including 0.5 hr practice)
- Platform Objectives
- Platform key features
- JVM, JRE, JDK
- JDK structure
- JDK installation
- Development cycle
- Build and run simple Java application
- Compilers in Java: compile-time and JIT, run-time optimizations
 
## Java application structure (2/1)
- Java application
- Class
- Class responsibility
- Class methods
- Method intention
- Developing simple application of two classes

### Compiling app
- Sourcepath
- Compile-time classpath 

### Running app
- Dynamic classloading
- Run-time classpath
- Packages
- Directive for namespace import
- Folders for packages
- JARs

### All together
- Build cycle
- Compiler arguments
- JVM arguments

## Intro to Maven (1/0.5)
- Build cycle
- Plugins
- pom.xml
- Dependencies
- Repo scopes

### Building simple application
- $M2_HOME
- mvn clean verify site

## Intro to git (2/0.5)
- Versioning value

### Local versioning cycle with DVCS
- Init
- Working dir
- Local repo
- Commit
- Branch
- Checkout

### Remote versioning cycle with DVCS
- Remote repos
- Origin
- Pulling
- Pushing
- Merging

### Configuration patterns
- Git flow
- Branch owners and policies
- Stable master
- Integration with dev
- Feature branches

### Working flow setup
- Clone trainers repo
- Group branch: actual agenda, examples
- Trainee pair branches: Pull Requests for review and feedback

## Java syntax for procedure style (3/1)
### Comments
- Single-line and multi-line
- JavaDoc

### Procedure style intro
- Intro to procedure style
- Class emulating packages
- Class methods declaration
- Class variables
- Class constants
- Java Dictionary for naming
- Naming convention
- Static import
- Static initializers

### Overloading
- Methods overloading

#### Lab: Procedure design for application
- FR: Chat application: send and receive messages, analytics, log messages, store messages for history, commands. 
- Architecture: client app, server app.
- TODO: classes and stubs for methods w/o parameters. 

### Call stack and Heap
- Local variables
- Parameters as local variables
- Primitive vs Reference types
- Call stack
- Method parameter passing styles

#### Lab: Components API
- Introduce parameters

## Built-in primitive types and operators (4/1)
### Primitives
- Primitive variable declaration and initialization
- Eight primitive types
- Types limits
- Primitive types literal values
- Primitive types casting: widening and narrowing
- Types overflow

#### Lab: Components API
- Parameters types recap

### Arithmetic operators
- Unary operators
- Binary operators
- Statement type
- Type promotions
- Increment and decrement: prefix and postfix forms
- Short ?= form
- Overloaded "+"

#### Lab: Analytics component
- FR: count all messages, count most frequent command. 

### Logic operators
- Operators
- Lazy and eager form
- Reference equality and value equality

### Ternary operator
- Ternary operator
- It's statement 

## Control flow structures (2/1)
### Branches
- if
- switch

#### Lab: Commands component
- Implement stubs for main commands 

### Cycles
- for
- do/while
- while/do
- foreach

#### Lab: Retry policy for transport 
- Implement error code and retrying policy for transport

### Procedure metrics
- Cyclomatic complexity

## Reference types (1/0)
- Reference
- _null_ literal
- Heap vs Stack
- Garbage collector
- JVisualVM's VisualGC demo

## Built-in reference types (4/1)
### Arrays
- Arrays and heap
- Arrays declaration
- Arrays initialization
- Immutability
- Array literals
- Multi-dimension arrays
- _foreach_ recap

#### Lab: multi-client application
- FR: Miltiply users can access application 

### Varargs
- Method declaration recap
- Varargs as arrays
- Limitations

#### Lab: Start-up parameters
- FR: show users messages that set up as start-up parameter vararg 

### Strings
- Literals
- String API
- String immutability
- String interning
- StringBuffer and StringBuilder
- Compiler optimizations for "+"

#### Lab: Implement commands
- Implement commands parser

### Primitive wrappers
- Wrappers
- Wrappers API
- Auto-boxing
- Immutability and interning

## OOAD intro (2/0)
### OOAD vs Procedure style
- Procedure style values
- Procedure style idioms supporting values

## OOAD
- OOAD recap
- OOAD values
- OOAD idioms supporting values

## Key concepts
- Responsibility
- State
- Encapsulation
- Polymorphism

## Demo for new way of designing
- Visibility as key for encapsulation
- Inheritance vs Delegation as code reuse styles
- Polymorphism as key for supportability
- Stateful and stateless design
- Metrics of OOAD: Coupling and Cohesion

## Java Syntax for OOP (8/2)
### Enums
- Enums emulation with _class_
- Final modifier: three semantics 
- Enums syntax
- Using with _switch_

#### Lab: Commands as enums
- Implement command system as enums 

### Encapsulation
- Access modifiers
- Code reuse with _this_
- Encapsulation for packages
- Encapsulation for classes

### Instatiation
- Constructors
- Object Initializers

#### Lab: Commands as classes
- Implement command system as objects

### Inheritance
- Inheritance implementation
- Code reuse with _super_
- Overriding methods
- Overriding constraints
- Constructors with inheritance issue
- Abstract classes
- Template Method design pattern

#### Lab: Commands as classes
- Reuse code with TM pattern

### Interfaces
- Interface vs Class
- Implementation
- Multiple implementation
- Default modifiers for fields and methods
- Static and default (defender) methods

### Polymorphism: design big picture
- Polymorphic collections
- Polymorphic arguments
- Polymorphic algorithms
- Type casting
- Sate/Strategy design patterns

#### Lab: Commands as classes
- Implement command system as State pattern

### Creational Patterns
- Creator
- Factories: factory method, simple factory, abstract factory
- DI

#### Lab: System testability 
- Implement DI for main components

## Generics (1/0.5)
- Generics as design style
- Type safety
- Generic classes
- Generic methods

## Intro to Functional Style (2/0)
### Old-school
- Nested Classes
- Inner classes
- Local classes
- Anonymous classes

### New way
- Closures in java
- Lambdas
- Functional Interfaces
- Functional style: state, function composition, declarative, immutability

## Error handling with exceptions (3/1)
- Exceptions vs Error codes
- What is exception
- Exception handling
- Standard Java exception types
- Designing own exception types system

#### Lab: Fail-over for system
- Implement exceptions type system and recovery

## System library (2/1)
- System
- Runtime
- Math

### Object
- toS
- hashCode and equals, their contract 

#### Lab: Messages as classes
- Implement messages with toS, eq, hc

## Annotations and Reflection API intro (1/0)
- Annotations
- Purpose of annotations
- Built-in annotations
- Custom annotations
- Reflection API overview
- Class loaders
- Class introspection

## Collection API (3/1)
- Collection types and implementations
- Iteration over collections
- Comparable and Comparator
- Maps and implementations
- Utility classes Collections and Arrays

#### Lab: Multi-user application with collections
- Implement chat rooms

- Stream API

#### Lab: Multi-user application with collections
- Implement chat rooms with stream API

- Queues

#### Lab: implement async request handling
- Queue as incoming request buffer

## Unit testing with JUnit (6/2)
- Assertions in Java

### Unit testing
- Testing scopes
- Unit tests
- Structure of unit test
- Tests and contract
- JUnit

### Assertions
- Hamcrest and FEST-assert

### Test doubles
- Test doubles types
- Mockito

### Coverage
- Types of coverage (including permutation)
- Coverage tools

### TDD and ATDD
- Intro to TDD
- Intro to ATDD

#### Lab: Test coverage
- Unit tests coverage ≥ 50%

## IO (6/2)
### File IO
- java.io.File
- RandomAccessFile
- Stream classes
- InputStreams and OutputStreams
- Readers and Writers
- Stream chaining

#### Lab: Client application
- Implement client application console IO

### Serialization API
- Serializable
- Serialization API

### Network IO
- Network API
- Sockets and ServerSocket API
- Welcome to hell no.1! CAP theorem

#### Lab: Client-server architecture 
- Implement network transport

### Intro to non-blocking/async IO
- Why async IO?
- Key concepts of NIO2

## Multi-threading in Java (8/3)
### Parallelism
- Thread definition
- Thread start: 3 options
- Thread states begin
- Priorities
- Daemons
- Thread API
- Blocking operations
- Thread states at whole

#### Lab: Multi-user application
- Implement parallel client connection and handling

### [Server IO Design Patterns](https://www.dre.vanderbilt.edu/%7Eschmidt/PDF/OOCP-tutorial4.pdf)
- Connector/Acceptor
- Proxy
- Pro-actor
- Handler

### Concurrency
- Welcome to hell no.2! Concurrency.
- Thread safety and data race
- Thread synchronization
- _synchronized_ section
- Lock API
- New thread states
- Objects thread safety: collections example
- wait() / notify()
- Deadlocks
- Intro to java.util.concurrent
- Welcome to hell no.3! JMM.

#### Lab: Data correctness
- Implement thread-safe multi-user application

## Web Services (6/2)
- Key concepts
- HTTP protocol recap: operation, headers, payload, error codes
- Servlet container concept
- Web application concept

### SOAP services intro
- SOAP
- WSDL

### REST services intro
- HTTP operations
- JSON payload
- REST API concept
- API Documenting

### Writing REST services in java
- JSR 311: Java API for RESTful services
- REST framework implementations
- JSR reference implementation
- JSON to Java mappers

### Calling REST services
- DII vs SII concepts
- Service stubs
- Implementing calls with JSR 

#### Lab: REST transport
- Refactor own client-server protocol to REST

## Test doubles for REST services (2/1)
- System integration concepts
- Integration testing
 
### Implementing integration tests with WireMock
- Test structure
- WireMock API

#### Lab: Integration testing for client
- Implement integration test for client with server test doubler
