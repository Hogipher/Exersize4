@main def main: Unit =
  // Warmup
  checkEvenXs {
    "(XX)*"
  }

  // Warmup
  checkOddXs {
    "(XX)*X"  
  }

  // Warmup
  checkOddXsAnyYs {
    "Y*(XY*XY*)*XY*"
  }

  // Warmup
  checkDsSeparatedByCs {
   "D|(DCD)+"
  }

  // Warmup
  ignorecheckAlternatingXsAndYs {
    ???
  }

  ignorecheckNo3AsOrBsInARow {
     ???//"(a|b)?(ab|ba)*(a|b)? | (a|b)?(ab|ba)+(a|b)(ab|ba)+(a|b)?|(a|b)?(a|b)?ab|(a|b)?ba"
  }

  checkNoABBA {
    "(a|b)?(a|b|bbb|aaa|aba|bab)(a|b)?|((a|b)?(a|b)?(a|b)?)"
  }

  // Uncomment the follow line if you want to play regex golf
  // golf = true

  checkABCsNo2InARow {
   "a?((cb?|bc?)a)*|b?((ca?|ac?)b)*|c?((ab?|ba?)c)*"
  }

  checkOddAsOddBs {
    "((aa|bb)*(ab)(bb|aa)*) | ((aa|bb)*(ba)(bb|aa)*) | ((ab|ba)+(ab)(ab|ba)+) | ((ab|ba)+(ba)(ab|ba)+)"
  }
  checkIBeforeEExceptAfterC {
    "(x*c+e*x*i*x*e*x*)|(i|c|x)*|(e|c|x)*"
  }
