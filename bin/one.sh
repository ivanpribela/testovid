#!/bin/bash
ant -f $TESTOVID_HOME/bin/one.xml -l "$TESTOVID_HOME/log.txt" -v -Dcourse.id=%1 -Dassignment.id=%2 -Dlocale=%3
