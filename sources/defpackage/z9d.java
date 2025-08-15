package defpackage;

import android.os.Bundle;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.Objects;

/* renamed from: z9d  reason: default package */
public final class z9d {
    public static final z9d b = new z9d(new HashSet());
    public static final String c = Integer.toString(0, 36);
    public final jx6 a;

    static {
        int i = oaf.a;
    }

    public z9d(Collection collection) {
        this.a = jx6.j(collection);
    }

    public static z9d b(Bundle bundle) {
        ArrayList parcelableArrayList = bundle.getParcelableArrayList(c);
        if (parcelableArrayList == null) {
            z04.c0("Missing commands. Creating an empty SessionCommands");
            return b;
        }
        HashSet hashSet = new HashSet();
        for (int i = 0; i < parcelableArrayList.size(); i++) {
            hashSet.add(y9d.a((Bundle) parcelableArrayList.get(i)));
        }
        return new z9d(hashSet);
    }

    public final boolean a(int i) {
        fm9.e("Use contains(Command) for custom command", i != 0);
        for (y9d y9d : this.a) {
            if (y9d.a == i) {
                return true;
            }
        }
        return false;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof z9d)) {
            return false;
        }
        return this.a.equals(((z9d) obj).a);
    }

    public final int hashCode() {
        return Objects.hash(new Object[]{this.a});
    }
}
