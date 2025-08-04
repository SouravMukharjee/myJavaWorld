## 📂 Repository Structure

```

myJavaWorld/
├── Array.java
├── Average.java
├── BoolTest.java
├── CharDemo.java
├── CharDemo2.java
├── ConversionW\.java  (likely Conversion Logic)
├── Light.java
├── Matrix.java
├── Promote.java
├── Scope.java
├── ThreeDMatrix.java
├── TwoDArray.java
├── TwoDM.java
├── area.java
├── myProjects/          ← Subfolder with Java projects (post-2025‑07‑26)
│   └── ...\[Java classes or extra main apps]

````

- **Root `.java` files** cover fundamental Java concepts—arrays, loops, type conversion, branching, operators, and basic algorithms.
- **`myProjects/` folder** (created in latest commit on 2025‑07‑26) holds longer, self-contained demo applications and modular code exercises :contentReference[oaicite:2]{index=2}.

All code is **100 % Java** (Java SE), no external libraries :contentReference[oaicite:3]{index=3}.

---

## 📆 Commit & Growth Log

| Date        | Commit Message                                             | Highlights                                                       |
|-------------|-------------------------------------------------------------|------------------------------------------------------------------|
| *2025‑07‑26* | Initial commit: added all Java files                        | Placed basic `.java` classes in root                             |
| *2025‑07‑26* | Add Scope, ThreeDMatrix, TwoDArray, TwoDM files             | Included sample code for typecasting, multidimensional arrays    |
| *2025‑07‑26* | Add projects under `myProjects` folder                      | Organized more advanced Java mini‑projects in subdirectory       |

(*Date pulled from GitHub commit history*) :contentReference[oaicite:4]{index=4}

---

## 🚀 Getting Started

### Prerequisites

- **Java Development Kit (JDK) 11 or later** installed
- Terminal or command-line shell (Windows CMD, PowerShell, macOS/Linux Bash)

### Clone & Navigate

```bash
git clone https://github.com/SouravMukharjee/myJavaWorld.git
cd myJavaWorld
````

### Compile & Run Single Java File

```bash
javac Array.java
java Array
```

Replace with any filename (e.g. `Light.java`, `BoolTest.java`, etc.) to compile and run individual demos.

---

## 🧰 Running Mini‑Projects

Each subfolder in `myProjects/` is expected to include its own file(s) with `main()`:

```bash
cd myProjects/<ProjectName>
javac *.java
java ProjectMainClass
```

If there’s a `README` inside a project folder, follow its specific instructions.

---

## 📘 What’s Inside – File Overview

Here’s how each root `.java` file helps you learn Java:

* **`Array.java`**, **`TwoDArray.java`**, **`ThreeDMatrix.java`** — multi-dimensional array traversal
* **`Average.java`** — division and precision with `double`
* **`BoolTest.java`**, **`Light.java`**, **`CharDemo.java`**, **`CharDemo2.java`** — booleans, `char`, and ASCII behavior
* **`ConversionW.java`** (`Conversion W`) — data type conversion (cast, widening, narrowing)
* **`Scope.java`** — scope rules with locals, fields, and blocks
* **`Promote.java`** — automatic type promotion in arithmetic
* **`Matrix.java`**, **`area.java`** — mathematical calculations / loops

Feel free to explore and modify—they’re ideal for hands‑on learning of control structures, loops, and basic Java syntax patterns.

---

## 💡 Recommended Learning Path

```
CharDemo   → BoolTest   → ConversionW   → Scope   → Promote
              ↓             ↓             ↓               
         Array → TwoDArray → ThreeDMatrix → Average → Matrix → area
```

* Start with **types, casting, and logic**
* Progress to **arrays and loops**
* Finish with **simple math operations and nested loops**

Challenge yourself: add comments, edge-case input,
extra example methods—or convert these into JUnit tests.

---

## ✍️ Style Guidelines

* Class name = filename (`Array.java` contains `class Array`)
* Include `/*...*/` or `//...` comments explaining logic
* Apply consistent indentation and `{}` placement
* Use meaningful variable names—avoid single-letter non-loop variables
* Java version: compliant with `javac` default encoding (UTF‑8)

---

## 🚧 Contribution Guide

1. ⭐ Fork this repo
2. Branch as `feature/new-demo` or `cleanup/promotion`
3. Runs tests or code manually before submitting
4. Open a PR with short, clear title and description

Suggested contributions:

* JUnit test suite for each root `.java` file
* CLI interface for math or array operations
* CSV-based student-grade calculator under `myProjects/`
* Extend `Promotion.java` to include BigInteger / BigDecimal demos

---

## 📜 License & Credit

No license file is included—this code is for **educational & self‑practice purposes only**.
Authored by **Sourav Mukharjee**, Java learning materials (July 2025) ([GitHub][1]).

https://souravfin.wordpress.com/souravs-codehub/
---

This README ensures:

* Clear overview (concept + file list)
* Guide beginners to compile and run code
* Mapped learning path and code standards
* A foundation for contribution and versioning

Happy coding in Java—every class is a new lesson! 🚀

```
