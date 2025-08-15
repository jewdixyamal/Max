package defpackage;

import android.os.Bundle;
import android.view.View;
import androidx.fragment.app.a;
import java.lang.reflect.Constructor;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.concurrent.CancellationException;
import kotlin.coroutines.Continuation;

/* renamed from: fdc  reason: default package */
public final class fdc implements ug7 {
    public final /* synthetic */ int a;
    public final Object b;

    public /* synthetic */ fdc(int i, Object obj) {
        this.a = i;
        this.b = obj;
    }

    public final void m(eh7 eh7, eg7 eg7) {
        View view;
        Object obj = this.b;
        switch (this.a) {
            case 0:
                if (eg7 == eg7.ON_CREATE) {
                    eh7.Q().f(this);
                    isc isc = (isc) obj;
                    Bundle c = isc.y().c("androidx.savedstate.Restarter");
                    if (c != null) {
                        ArrayList<String> stringArrayList = c.getStringArrayList("classes_to_restore");
                        if (stringArrayList != null) {
                            for (String next : stringArrayList) {
                                try {
                                    Class<? extends U> asSubclass = Class.forName(next, false, fdc.class.getClassLoader()).asSubclass(gsc.class);
                                    try {
                                        Constructor<? extends U> declaredConstructor = asSubclass.getDeclaredConstructor((Class[]) null);
                                        declaredConstructor.setAccessible(true);
                                        try {
                                            gsc gsc = (gsc) declaredConstructor.newInstance((Object[]) null);
                                            if (isc instanceof ynf) {
                                                xnf w = ((ynf) isc).w();
                                                mm y = isc.y();
                                                w.getClass();
                                                LinkedHashMap linkedHashMap = w.a;
                                                Iterator it = new HashSet(linkedHashMap.keySet()).iterator();
                                                while (it.hasNext()) {
                                                    fp3.e((qnf) linkedHashMap.get((String) it.next()), y, isc.Q());
                                                }
                                                if (!new HashSet(linkedHashMap.keySet()).isEmpty()) {
                                                    y.g();
                                                }
                                            } else {
                                                throw new IllegalStateException("Internal error: OnRecreation should be registered only on components that implement ViewModelStoreOwner".toString());
                                            }
                                        } catch (Exception e) {
                                            throw new RuntimeException(wg0.i("Failed to instantiate ", next), e);
                                        }
                                    } catch (NoSuchMethodException e2) {
                                        throw new IllegalStateException("Class " + asSubclass.getSimpleName() + " must have default constructor in order to be automatically recreated", e2);
                                    }
                                } catch (ClassNotFoundException e3) {
                                    throw new RuntimeException(zr6.i("Class ", next, " wasn't found"), e3);
                                }
                            }
                            return;
                        }
                        throw new IllegalStateException("Bundle with restored state for the component \"androidx.savedstate.Restarter\" must contain list of strings by the key \"classes_to_restore\"");
                    }
                    return;
                }
                throw new AssertionError("Next event must be ON_CREATE");
            case 1:
                yb3 yb3 = (yb3) obj;
                if (yb3.X == null) {
                    ub3 ub3 = (ub3) yb3.getLastNonConfigurationInstance();
                    if (ub3 != null) {
                        yb3.X = ub3.b;
                    }
                    if (yb3.X == null) {
                        yb3.X = new xnf();
                    }
                }
                yb3.a.f(this);
                return;
            case 2:
                new HashMap();
                fa6[] fa6Arr = (fa6[]) obj;
                if (fa6Arr.length > 0) {
                    fa6 fa6 = fa6Arr[0];
                    throw null;
                } else if (fa6Arr.length > 0) {
                    fa6 fa62 = fa6Arr[0];
                    throw null;
                } else {
                    return;
                }
            case 3:
                if (eg7 == eg7.ON_DESTROY) {
                    ia5 ia5 = (ia5) obj;
                    ia5.a = null;
                    LinkedList<ha5> linkedList = ia5.b;
                    for (ha5 ha5 : linkedList) {
                        ha5.b.invoke();
                    }
                    linkedList.clear();
                    return;
                }
                return;
            case 4:
                if (eg7 == eg7.ON_STOP && (view = ((a) obj).U0) != null) {
                    view.cancelPendingInputEvents();
                    return;
                }
                return;
            case 5:
                ((pz7) obj).f(false);
                return;
            case 6:
                hm9.m("l84", "onStateChanged: new event = " + eg7, new Object[0]);
                if (eg7 == eg7.ON_RESUME) {
                    l84 l84 = (l84) obj;
                    x77 x77 = (x77) l84.e;
                    if (x77 != null) {
                        x77.cancel((CancellationException) null);
                    }
                    int i = ((fz6) ((bkg) l84.c).b).z0.get();
                    hm9.m("l84", "onStateChanged: prevAllMediaCount = " + i, new Object[0]);
                    l84.e = j47.T((sx3) l84.a, (ox3) l84.b, (vx3) null, new ey7(l84, i, (Continuation) null), 2);
                    return;
                }
                return;
            default:
                if (eg7 == eg7.ON_CREATE) {
                    eh7.Q().f(this);
                    ((fsc) obj).b();
                    return;
                }
                throw new IllegalStateException(("Next event must be ON_CREATE, it was " + eg7).toString());
        }
    }
}
