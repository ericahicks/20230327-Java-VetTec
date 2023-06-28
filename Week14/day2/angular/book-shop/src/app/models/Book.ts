// Write a Book class with the fields
/*

*/

// You can write getters and setters 
// that look more like Java if you prefer

// conventions to follow
// - 
import { Genre } from "./genre";

export class Book {
    private title: string;

    constructor(title: string) {
        this.title = title;
    }

    public getTitle(): string {
        return this.title;
    }

    public setTitle(title: string): void {
        if (title.length > 2) {
            this.title = title;
        }
    }
}
// export  { Book } ;
