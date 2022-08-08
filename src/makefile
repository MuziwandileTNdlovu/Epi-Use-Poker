SRC=./main                              ➀
CLASSDEST=build/classes
JARDEST=build
TESTSRC=/test
TESTCLASSDEST=build/testclasses

JAVA=$(shell find $(SRC) -type f -name '*.java')  ➁
TESTJAVA=$(shell find $(TESTSRC) -type f -name '*.java')
CLASSES=$(patsubst $(SRC)/%, $(CLASSDEST)/%, $(JAVA:%.java=%.class))
TESTCLASSES=$(patsubst $(TESTSRC)/%, $(TESTCLASSDEST)/%, $(TESTJAVA:%.java=%.class))
TESTCLASSNAMES=$(subst /,.,$(subst $(TESTSRC)/, ,$(TESTJAVA:%.java=%)))



.SUFFIXES:


# 
# Targets:
# 
all: test $(JARDEST)/$(TARGET)

build/setup:                                  ➂
    mkdir out $(JARDEST)
    -mkdir -p $(CLASSDEST)
    -mkdir -p $(TESTCLASSDEST)
    date > $@


$(JARDEST)/$(TARGET): $(CLASSES)               ➃
    cd $(CLASSDEST); jar cf temp.jar *
    mv $(CLASSDEST)/temp.jar $@




test: $(TESTCLASSES) $(CLASSES)                ➄
    java -cp lib/junit-4.10.jar:lib/junit/hamcrest-core-1.1.jar:$(CLASSDEST):$(TESTCLASSDEST) org.junit.runner.JUnitCore $(TESTCLASSNAMES)



$(CLASSDEST)/%.class: $(SRC)/%.java build/setup    ➅
    javac -g -cp $(CLASSDEST) -d $(CLASSDEST) -sourcepath $(SRC) $(SRC)/$*.java

$(TESTCLASSDEST)/%.class: $(TESTSRC)/%.java build/setup $(CLASSES)
    javac -g -cp $(CLASSDEST):lib/junit-4.10.jar:lib/junit/hamcrest-core-1.1.jar -d $(TESTCLASSDEST)  -sourcepath $(TESTSRC) $(TESTSRC)/$*.java



clean:
    -rm -f build