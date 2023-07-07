# Downloading the Code for the practice-warehouse-api

This is a small backend for creating a warehouse and address in a database.

## Details

Built using Spring Boot and Data JPA with a MySQL backend.

## Usage
To use this project, do the following steps:

1. In a terminal run the command `git clone https://github.com/ericahicks/practice-warehouse-api.git` to get the project code 
2. Then open spring tool suite (or your IDE) and do a File>Open projects from file system... and search for where you cloned it.
3. Then just update the application.properties file to use
   a. your password
   b. your schema name (we are using a schema named warehouse)
   c. ddl-auto=create (you can change it back to using ddl-auto=validate once you have created the tables)
4. Make sure you open MySQL workbench and run the command `create schema warehouse;` if you haven't created a schema yet.
5. Then you can open the Boot Dashboard in spring tool suite (or your IDE) and run the backend!
6. Test it using Postman at https://localhost:8080/warehouse
   a. GET should return an array of warehouses
   b. POST should return a single warehouse object of format:
   ```
    {
     "warehouseId": 0,
     "name": "",
      "size": 0,
      "address": {
         "addressId": 0,
         "streetAddress": "",
         "city": "",
         "state": "",
         "zipCode": ""
       }
    }
   ```

# Downloading the Code for the practice-warehouse-gui

## Get the Angular Project Code from GitHub

(If there are other projets in the GitHub you don't want to grab, use a sparse checkout)
[Git Sparse Checkout Instructions](https://stackoverflow.com/questions/600079/how-do-i-clone-a-subdirectory-only-of-a-git-repository)

```
mkdir <repo>
cd <repo>
git init
git remote add -f origin <url>
```
For us it would be:
```
mkdir practice
git init
git remote add -f origin https://github.com/ericahicks/practice-warehouse-gui.git
```
This creates an empty repository with your remote, and fetches all objects but doesn't check them out. Then do:
```
git config core.sparseCheckout true
```
Now you need to define which files/folders you want to actually check out. This is done by listing them in .git/info/sparse-checkout, eg:
```
echo "some/dir/" >> .git/info/sparse-checkout
echo "another/sub/tree" >> .git/info/sparse-checkout
```
For us this will probably be
```
 echo "Week15/Day5/practice-warehouse-gui/" >> .git/info/sparse-checkout
```
Last but not least, update your empty repo with the state from the remote:
```
git pull origin main
```
You will now have files "checked out" for some/dir and another/sub/tree on your file system (with those paths still), and no other paths present.

You might want to have a look at the extended tutorial and you should probably read the official documentation for sparse checkout and read-tree.

-------------

```
git init
git remote add -f origin <url>
git config core.sparseCheckout true
echo "Week15/Day5/practice-warehouse-gui/" >> .git/info/sparse-checkout
git pull origin main
```

## Get the code up and running

1. Once you have the files downloaded, open Visual Studio Code, select Open Folder, and navigate to the Angular project's root directory. Open the folder.

2. Once you have opened the folder in Visual Studio Code, open a terminal and run
```
npm install
```
   This will grab all of the dependencies and generate the node_modules folder. (This may take a while.)

3. Run the program using
```
ng serve --open
```

