####psappconcurmultithreadjava

#####2
######stop a thread.
should not use stop method, should use interrupt.The interrupt does not stop thread, just send a signal to the task the task is running.
```
th.interrupt()
th.isInterrupted()
```
wait join notify may cause interruptedexception

######wrapup
get state of a thread
```
Thread.State s = thread.getState()
```
may have
```
NEW, RUNNABLE,TERRMINATE, BLOCKED, WAITING,TIME_WAITING
```
#####ordering read and writes operations on multicore cpu
visibility, cpu core 1 can share value to cpu core (L1) not memory.  
all synchronized writes are visible  
######definition of the happens-before link
multicore cpu->readandwrite can happen at the same time  
visibility means "a read should return the value set by the last value"
######understanding happen before link example
a "happen before exists between all synchronized or volatile write/read operations that follow
######sychro and volatility on shared vars
synchronization: guarantees the exclusive execution of a block of code.  
visibility: guarantees the consistency of the variables