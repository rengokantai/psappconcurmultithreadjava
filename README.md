####psappconcurmultithreadjava

#####2
######stop a thread.
should not use stop method, should use interrupt.The interrupt does not stop thread, just send a signal to the task the task is running.
```
th.interrupt()
th.isInterrupted()
```
wait join notify may cause interruptedexception