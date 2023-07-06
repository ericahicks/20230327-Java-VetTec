export class Person {

    constructor(private _name: string, private _favoriteColor: string) { }

    public get name() {
        return this._name;
    }

    public set name(name: string) {
        this._name = name;
    }

    public get favoriteColor() {
        return this._favoriteColor;
    }

    public set favoriteColor(color: string) {
        this._favoriteColor = color;
    }
}
