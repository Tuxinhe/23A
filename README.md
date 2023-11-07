#  資管三甲 C110118152 凃辛河
## 資管三甲 C110118152 凃辛河
### 資管三甲 C110118152 凃辛河
>emphasis, aka italics, with asterisks or underscores
>strong emphasis, aka bold, with **asterisks** or **underscores**.
>Combined emphasis with **asterisks** and ***underscores***.
>strikethrough uses two tildes. ~~Scratch this~~.

------------------------------------------------------
![NKUST](NKUST.png "高科大")
--------------------------

- [x] To do list
- [ ] 2nd thing
- [ ] 3rd thing
- [ ] 4th thing

----------------------------

```java
public class CShape {
    protected String color;

    public CShape(String color) {
        this.color = color;
    }

    public double getArea() {
        return 0.0;
    }
}

public class CTriangle extends CShape {
    private double a, b, c;

    public CTriangle(String color, double a, double b, double c) {
        super(color);
        this.a = a;
        this.b = b;
        this.c = c;
    }

    @Override
    public double getArea() {
        return 0.5 * a * b;
    }
}

public class Main {
    public static void main(String[] args) {
        String color = "红色";
        double a = 3.0;
        double b = 4.0;
        double c = 5.0;

        CTriangle triangle = new CTriangle(color, a, b, c);

        System.out.println("颜色: " + triangle.color);
        System.out.println("面积: " + triangle.getArea());
    }
}


```
-----------------------------
```javascript
var s ="javascript syntax text ";
alert(s)
```

表格:
| Tables  | Are | Cool |
| :----------- | :------------: | ------------: |
| col 3 is     | right -aligned | $1600 |
| col 2 is     | centered | $12 |
| zebra stripes | are neat | $1 |

there  must be at least 3 dashes separating each header cell.
the outer pipes (|) are optional, and you don't need to make the 
raw Markdown line up prettily. You can also use inline Markdown. 


| Markdown | Less | Pretty |
| --- | --- | --- |
| *Still* | `renders` | **nicely** |
| 1 | 2 | 3 |

