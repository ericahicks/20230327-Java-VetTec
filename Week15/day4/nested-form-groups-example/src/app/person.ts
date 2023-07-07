import { AlterEgo } from "./alter-ego";

export class Person {

    constructor(public id: number,
                    public name: string,
                        public job: string,
                            public alterEgo: AlterEgo) {}
}
