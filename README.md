<p align="center">
  <img src="./static/Picture1.png"  alt="logo"/>
</p>
<p align="center" style ="font-size: 24px"><em>Факультет мехатроники и робототехники</em></p>

<p align="center" style ="font-size: 24px"><strong>Лабораторная работа №2 </br>
По дисциплине : «Программирование»</br>
Вариант 52179</strong>
</p>
<p align="left">Преподаватель: <strong>Райла Мартин</strong></br>
Выполнил: <strong>Нгуен Тоан</strong></br>
Группа: <strong>R3137</strong>
</p>

# Лабораторная работа #2

## 1. Покемоны
![pokemons](./static/pokemons.png)

## 2. Диаграмма классов
![diagrams](./static/PokemonDiagram.png)

## 3. Исходный код

### 3.1 Battlegroup.java
```java
import Pokemons.*;
import ru.ifmo.se.pokemon.Battle;

class Battleground {
    public static void main(String[] args) {
        // Init a Battle
        Battle b = new Battle();

        // Pokemons join Battle
        Simisage p1 = new Simisage("Nguyễn Văn A", 1);
        Zekrom p2 = new Zekrom("Trần Thị B", 2);
        Weepinbell p3 = new Weepinbell("Nhốc", 3);
        Zekrom p4 = new Zekrom("Đặng Thị C", 1);
        Pansage p5 = new Pansage("Hứa Văn Hẹn", 3);
        Bellsprout p6 = new Bellsprout("Hihi", 3);

        b.addAlly(p1);
        b.addAlly(p2);
        b.addAlly(p3);
        b.addFoe(p4);
        b.addFoe(p5);
        b.addFoe(p6);

        // Fight!!!
        b.go();
    }
}
```

### 3.2 Some class in Pokemons
#### Zekrom.java
```java
package Pokemons;

import Moves.*;
import ru.ifmo.se.pokemon.*;

public class Zekrom extends Pokemon{
    
    public Zekrom(String name, int level){
        // init name and level
        super(name, level);
        // Set base stats
        setStats(100, 150, 120, 120, 100, 90);
        // init type of pokemon
        setType(Type.DRAGON, Type.ELECTRIC);
        // init move
        setMove(new XScissor(), new DynamicPunch(), new Thunder(), new Slash());
        
    }
}
```

#### Pansage.java
```java
package Pokemons;

import Moves.*;
import ru.ifmo.se.pokemon.*;

public class Pansage extends Pokemon{
    
    public Pansage(String name, int level){
        // init name and level
        super(name, level);
        // Set base stats
        setStats(50, 53, 48, 53, 48, 64);
        // init type of pokemon
        setType(Type.GRASS);
        // init move
        setMove(new JumpKick(), new FurySwipes(), new MilkDrink());
        
    }
}
```

#### Simisage.java
```java
package Pokemons;

import Moves.*;

public class Simisage extends Pansage {
    public Simisage(String name, int level){
        super(name, level);
        setStats(75, 98, 63, 98, 63, 101);
        addMove(new GyroBall());
    }
}
```

### 3.3 Some class in moves
#### Xscissor.java
```java
package Moves;

import ru.ifmo.se.pokemon.*;

public class XScissor extends PhysicalMove{
    public XScissor(){
        super(Type.BUG, 80, 100);
    }    

    @Override
    protected String describe(){
        return "Use X-Scissor";
    }
}
```

#### GyroBall.java
```java
package Moves;

import ru.ifmo.se.pokemon.*;
import Pokemons.Simisage;

public class GyroBall extends PhysicalMove {
    public GyroBall(){
        super(Type.STEEL, 0, 100);
    }

    public double seflSpeed;

    @Override
    protected void applySelfDamage(Pokemon p, double dame){
        this.seflSpeed = p.getStat(Stat.SPEED);
        super.applySelfDamage(p, dame);
    }

    @Override
    protected void applyOppDamage(Pokemon p_user, double dam){
        double k = 25 * p_user.getStat(Stat.SPEED) / this.seflSpeed;
        super.applyOppDamage(p_user, k);
    }
    
    @Override
    protected String describe(){
        return "Use Gyro Ball";
    }
}
```

#### FurySwitch.java
```java
package Moves;

import ru.ifmo.se.pokemon.*;
import java.util.Random;

public class FurySwipes extends PhysicalMove {
    public FurySwipes(){
        super(Type.NORMAL, 18, 80);
    }

    @Override
    protected void applyOppDamage(Pokemon p, double dam){
        Random random = new Random();
        int randomNumber = random.nextInt(5 - 2) + 2;
        if (randomNumber == 2){
            super.applyOppDamage(p, dam*2);
        }
        else if (randomNumber == 3){
            super.applyOppDamage(p, dam*3);
        }
        else if (randomNumber == 4){
            super.applyOppDamage(p, dam*4);
        }
        else {
            super.applyOppDamage(p, dam*5);
        }
    }

    @Override
    protected String describe(){
        return "Use Fury Swipes";
    }
}
```

## 3. Резунтат
```java
Fight!!!
Simisage Nguyễn Văn A из команды синих вступает в бой!
Zekrom Đặng Thị C из команды зеленых вступает в бой!
Simisage Nguyễn Văn A Use Jump Kick.
Zekrom Đặng Thị C теряет 5 здоровья.

Zekrom Đặng Thị C Use Slash.
Simisage Nguyễn Văn A теряет 12 здоровья.

Simisage Nguyễn Văn A Use Gyro Ball.
Zekrom Đặng Thị C восстанавливает 1 здоровья.

Zekrom Đặng Thị C Use X-Scissor.
Simisage Nguyễn Văn A теряет 12 здоровья.
Simisage Nguyễn Văn A теряет сознание.
Zekrom Trần Thị B из команды синих вступает в бой!
Zekrom Trần Thị B Use Slash.
Zekrom Đặng Thị C теряет 10 здоровья.
Zekrom Đặng Thị C теряет сознание.
Pansage Hứa Văn Hẹn из команды зеленых вступает в бой!
Pansage Hứa Văn Hẹn Use Jump Kick.
Zekrom Trần Thị B теряет 5 здоровья.

Zekrom Trần Thị B Use Thunder.
Pansage Hứa Văn Hẹn теряет 4 здоровья.

Pansage Hứa Văn Hẹn Use Fury Swipes.
Zekrom Trần Thị B теряет 6 здоровья.

Zekrom Trần Thị B Use Thunder.
Pansage Hứa Văn Hẹn теряет 4 здоровья.

Pansage Hứa Văn Hẹn Use Jump Kick.
Zekrom Trần Thị B теряет 7 здоровья.
Zekrom Trần Thị B теряет сознание.
Weepinbell Nhốc из команды синих вступает в бой!
Pansage Hứa Văn Hẹn промахивается

Weepinbell Nhốc Use Earthquake.
Критический удар!
Pansage Hứa Văn Hẹn теряет 18 здоровья.
Pansage Hứa Văn Hẹn теряет сознание.
Bellsprout Hihi из команды зеленых вступает в бой!
Weepinbell Nhốc Use Earthquake.

Bellsprout Hihi Use Earthquake.

Weepinbell Nhốc Use Leech Life.
Bellsprout Hihi теряет 5 здоровья.

Bellsprout Hihi Use Earthquake.

Weepinbell Nhốc Use Leech Life.
Bellsprout Hihi теряет 6 здоровья.

Bellsprout Hihi Use Leech Life.
Weepinbell Nhốc теряет 4 здоровья.
Bellsprout Hihi восстанавливает 5 здоровья.

Weepinbell Nhốc Use Stun Spore.
Bellsprout Hihi парализован

Bellsprout Hihi Use Earthquake.
Критический удар!

Bellsprout Hihi Use Earthquake.
Критический удар!
Weepinbell Nhốc теряет 22 здоровья.
Weepinbell Nhốc теряет сознание.
В команде синих не осталось покемонов.
Команда зеленых побеждает в этом бою!
```

## 4. Вывод
Во время выполнения данной лабораторной работы я изучил основные принципы ООП, научился работать с методами, классами, модификаторами доступами и сторонними библиотеками.


