package defpackage;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;

/* renamed from: s9f  reason: default package */
public final class s9f {
    public static final List d = Arrays.asList(new Integer[]{1, 2, 4, 3, 7});
    public uof a;
    public final ArrayList b = new ArrayList();
    public final ArrayList c = new ArrayList();

    public final void a(l9f l9f) {
        this.b.add(l9f);
    }

    public final adb b() {
        ArrayList arrayList = this.b;
        c54.j("UseCase must not be empty.", !arrayList.isEmpty());
        ArrayList arrayList2 = this.c;
        Iterator it = arrayList2.iterator();
        int i = 0;
        while (it.hasNext()) {
            int i2 = ((zgf) it.next()).a;
            v3c.h(i2, d);
            int i3 = i & i2;
            if (i3 <= 0) {
                i |= i2;
            } else {
                Locale locale = Locale.US;
                throw new IllegalArgumentException(zr6.i("More than one effects has targets ", v3c.o(i3), "."));
            }
        }
        return new adb(this.a, arrayList, arrayList2);
    }
}
