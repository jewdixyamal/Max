package defpackage;

import android.app.Application;
import android.os.Bundle;
import androidx.lifecycle.AndroidViewModel;
import java.lang.reflect.Constructor;
import java.util.LinkedHashMap;

/* renamed from: jsc  reason: default package */
public final class jsc implements vnf {
    public final Application a;
    public final unf b;
    public final Bundle c;
    public final gh7 d;
    public final mm e;

    public jsc(Application application, isc isc, Bundle bundle) {
        unf unf;
        this.e = isc.y();
        this.d = isc.Q();
        this.c = bundle;
        this.a = application;
        if (application != null) {
            if (unf.c == null) {
                unf.c = new unf(application);
            }
            unf = unf.c;
        } else {
            unf = new unf((Application) null);
        }
        this.b = unf;
    }

    public final qnf a(Class cls) {
        String canonicalName = cls.getCanonicalName();
        if (canonicalName != null) {
            return d(cls, canonicalName);
        }
        throw new IllegalArgumentException("Local and anonymous classes can not be ViewModels");
    }

    public final qnf b(Class cls, wh9 wh9) {
        xxc xxc = xxc.Z;
        LinkedHashMap linkedHashMap = wh9.a;
        String str = (String) linkedHashMap.get(xxc);
        if (str == null) {
            throw new IllegalStateException("VIEW_MODEL_KEY must always be provided by ViewModelProvider");
        } else if (linkedHashMap.get(z7.e) != null && linkedHashMap.get(z7.f) != null) {
            Application application = (Application) linkedHashMap.get(unf.d);
            boolean isAssignableFrom = AndroidViewModel.class.isAssignableFrom(cls);
            Constructor a2 = (!isAssignableFrom || application == null) ? ksc.a(cls, ksc.b) : ksc.a(cls, ksc.a);
            return a2 == null ? this.b.b(cls, wh9) : (!isAssignableFrom || application == null) ? ksc.b(cls, a2, z7.f(wh9)) : ksc.b(cls, a2, application, z7.f(wh9));
        } else if (this.d != null) {
            return d(cls, str);
        } else {
            throw new IllegalStateException("SAVED_STATE_REGISTRY_OWNER_KEY andVIEW_MODEL_STORE_OWNER_KEY must be provided in the creation extras tosuccessfully create a ViewModel.");
        }
    }

    /* JADX WARNING: type inference failed for: r7v12, types: [java.lang.Object, wnf] */
    public final qnf d(Class cls, String str) {
        gh7 gh7 = this.d;
        if (gh7 != null) {
            boolean isAssignableFrom = AndroidViewModel.class.isAssignableFrom(cls);
            Application application = this.a;
            Constructor a2 = (!isAssignableFrom || application == null) ? ksc.a(cls, ksc.b) : ksc.a(cls, ksc.a);
            if (a2 != null) {
                mm mmVar = this.e;
                Bundle c2 = mmVar.c(str);
                Class[] clsArr = csc.f;
                csc h = lz7.h(c2, this.c);
                dsc dsc = new dsc(str, h);
                dsc.a(mmVar, gh7);
                fg7 fg7 = gh7.d;
                if (fg7 == fg7.b || fg7.a(fg7.o)) {
                    mmVar.g();
                } else {
                    gh7.a(new bc4(gh7, 3, mmVar));
                }
                qnf b2 = (!isAssignableFrom || application == null) ? ksc.b(cls, a2, h) : ksc.b(cls, a2, application, h);
                b2.a("androidx.lifecycle.savedstate.vm.tag", dsc);
                return b2;
            } else if (application != null) {
                return this.b.a(cls);
            } else {
                if (wnf.a == null) {
                    wnf.a = new Object();
                }
                return wnf.a.a(cls);
            }
        } else {
            throw new UnsupportedOperationException("SavedStateViewModelFactory constructed with empty constructor supports only calls to create(modelClass: Class<T>, extras: CreationExtras).");
        }
    }
}
