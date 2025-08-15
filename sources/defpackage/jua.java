package defpackage;

import android.app.Person;
import android.content.Context;
import android.graphics.PorterDuff;
import android.graphics.drawable.Icon;
import androidx.core.graphics.drawable.IconCompat;

/* renamed from: jua  reason: default package */
public abstract class jua {
    /* JADX WARNING: type inference failed for: r5v0, types: [kua, java.lang.Object] */
    public static kua a(Person person) {
        IconCompat iconCompat;
        CharSequence name = person.getName();
        if (person.getIcon() != null) {
            Icon icon = person.getIcon();
            PorterDuff.Mode mode = IconCompat.k;
            iconCompat = cs6.a(icon);
        } else {
            iconCompat = null;
        }
        String uri = person.getUri();
        String key = person.getKey();
        boolean isBot = person.isBot();
        boolean isImportant = person.isImportant();
        ? obj = new Object();
        obj.a = name;
        obj.b = iconCompat;
        obj.c = uri;
        obj.d = key;
        obj.e = isBot;
        obj.f = isImportant;
        return obj;
    }

    public static Person b(kua kua) {
        Person.Builder name = new Person.Builder().setName(kua.a);
        Icon icon = null;
        IconCompat iconCompat = kua.b;
        if (iconCompat != null) {
            iconCompat.getClass();
            icon = cs6.d(iconCompat, (Context) null);
        }
        return name.setIcon(icon).setUri(kua.c).setKey(kua.d).setBot(kua.e).setImportant(kua.f).build();
    }
}
