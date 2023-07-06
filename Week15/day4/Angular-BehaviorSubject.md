# How to Use BehaviorSubject Objects in Angular

A `BehaviorSubject` is something whose state change is tracked as it changes

```
import { BehaviorSubject } from 'rxjs';

// Create a new BehaviorSubject with an initial value
const subject = new BehaviorSubject<string>('initial value');

// Subscribe to the BehaviorSubject -- This would be in each of the components we want to use the subject's value in
subject.subscribe(data => console.log('Subject is ', value));

// Emit a new value
subject.next('updated value1');

subject.next('updated value2');

// Output:
// Subject is initial value
// Subject is updated value1
// Subject is updated value2

```