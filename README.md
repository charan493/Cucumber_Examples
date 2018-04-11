# Cucumber Examples
## Adding Cucumber dependencies in Pom.xml 
       
       <dependency>
            <groupId>info.cukes</groupId>
            <artifactId>cucumber-java</artifactId>
            <version>1.2.5</version>
        </dependency>
        <dependency>
            <groupId>info.cukes</groupId>
            <artifactId>cucumber-testng</artifactId>
            <version>1.2.5</version>
        </dependency>
        <dependency>
            <groupId>info.cukes</groupId>
            <artifactId>gherkin</artifactId>
            <version>2.12.2</version>
        </dependency>
        <dependency>
            <groupId>info.cukes</groupId>
            <artifactId>cucumber-core</artifactId>
            <version>1.2.5</version>
        </dependency>

## Basic Annotations of cucumber.
    1. Given
    2. When
    3. Then
    4. And
    5. But
    6. Scenario
    7. Scenario Outline
    8. Examples
    9. Features
    10. Background
## Folder Structure
    example
    |-- pom.xml
    |-- src
       |-- main
           |-- java
       |-- test
           |-- java
               |-- com
                   |-- cucumber
                       |-- example
                           |-- CustomeClassTest.java 
                           |-- DataTableTest.java
                           |-- ExampleTest.java
                           |-- PrameterTest.java
           |-- resources
               |-- Features
                   |-- CustomeClass.feature
                   |-- DataTable.feature
                   |-- Example.feature
                   |-- Prameter.feature

## Cucumber Examples
1. Basic Example - ExampleTest/Example.feature
2. Data Parameterization - ParameterTest/Parameter.feature
3. Fetch Data from Tables - DataTableTest/DataTable.feature
4. Custom Class for Fetching data from Table - CustomClassTest/CustomClass.feature
