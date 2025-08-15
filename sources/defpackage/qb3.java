package defpackage;

import android.os.Bundle;
import androidx.fragment.app.b;
import androidx.fragment.app.c;
import java.util.ArrayList;
import java.util.LinkedHashMap;

/* renamed from: qb3  reason: default package */
public final /* synthetic */ class qb3 implements hsc {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ qb3(int i, Object obj) {
        this.a = i;
        this.b = obj;
    }

    public final Bundle a() {
        b bVar;
        switch (this.a) {
            case 0:
                Bundle bundle = new Bundle();
                wb3 wb3 = ((yb3) this.b).s0;
                wb3.getClass();
                LinkedHashMap linkedHashMap = wb3.b;
                bundle.putIntegerArrayList("KEY_COMPONENT_ACTIVITY_REGISTERED_RCS", new ArrayList(linkedHashMap.values()));
                bundle.putStringArrayList("KEY_COMPONENT_ACTIVITY_REGISTERED_KEYS", new ArrayList(linkedHashMap.keySet()));
                bundle.putStringArrayList("KEY_COMPONENT_ACTIVITY_LAUNCHED_KEYS", new ArrayList(wb3.d));
                bundle.putBundle("KEY_COMPONENT_ACTIVITY_PENDING_RESULT", new Bundle(wb3.g));
                return bundle;
            case 1:
                break;
            case 2:
                return ((c) this.b).a0();
            default:
                return csc.a((csc) this.b);
        }
        do {
            bVar = (b) this.b;
        } while (b.T(bVar.S()));
        bVar.F0.d(eg7.ON_STOP);
        return new Bundle();
    }
}
