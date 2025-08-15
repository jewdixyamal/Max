package defpackage;

import android.content.Context;
import android.os.Bundle;
import android.os.IBinder;
import android.support.v4.media.MediaBrowserCompat;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.UUID;
import java.util.WeakHashMap;

/* renamed from: z68  reason: default package */
public final class z68 implements Runnable {
    public final /* synthetic */ Object X;
    public final /* synthetic */ Object Y;
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object o;

    public /* synthetic */ z68(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, int i) {
        this.a = i;
        this.Y = obj;
        this.b = obj2;
        this.c = obj3;
        this.o = obj4;
        this.X = obj5;
    }

    public final void run() {
        switch (this.a) {
            case 0:
                IBinder binder = ((c78) ((b78) this.b)).a.getBinder();
                gaa gaa = (gaa) this.Y;
                s68 s68 = (s68) ((cj8) gaa.a).X.get(binder);
                if (s68 != null) {
                    cj8 cj8 = (cj8) gaa.a;
                    cj8.getClass();
                    HashMap hashMap = s68.f;
                    String str = (String) this.c;
                    List list = (List) hashMap.get(str);
                    if (list == null) {
                        list = new ArrayList();
                    }
                    Iterator it = list.iterator();
                    while (true) {
                        boolean hasNext = it.hasNext();
                        IBinder iBinder = (IBinder) this.o;
                        Bundle bundle = (Bundle) this.X;
                        if (hasNext) {
                            mpa mpa = (mpa) it.next();
                            if (iBinder == mpa.a) {
                                Bundle bundle2 = (Bundle) mpa.b;
                                if (bundle != bundle2) {
                                    if (bundle == null) {
                                        fm9.l(bundle2);
                                        if (bundle2.getInt(MediaBrowserCompat.EXTRA_PAGE, -1) == -1 && bundle2.getInt(MediaBrowserCompat.EXTRA_PAGE_SIZE, -1) == -1) {
                                            return;
                                        }
                                    } else if (bundle2 == null) {
                                        if (bundle.getInt(MediaBrowserCompat.EXTRA_PAGE, -1) == -1 && bundle.getInt(MediaBrowserCompat.EXTRA_PAGE_SIZE, -1) == -1) {
                                            return;
                                        }
                                    } else if (bundle.getInt(MediaBrowserCompat.EXTRA_PAGE, -1) == bundle2.getInt(MediaBrowserCompat.EXTRA_PAGE, -1) && bundle.getInt(MediaBrowserCompat.EXTRA_PAGE_SIZE, -1) == bundle2.getInt(MediaBrowserCompat.EXTRA_PAGE_SIZE, -1)) {
                                        return;
                                    }
                                } else {
                                    return;
                                }
                            }
                        } else {
                            list.add(new mpa(iBinder, bundle));
                            hashMap.put(str, list);
                            r68 r68 = new r68(cj8, str, s68, str, bundle);
                            cj8.Y = s68;
                            if (bundle == null) {
                                r68.c();
                            } else {
                                r68.b = 1;
                                r68.c();
                            }
                            cj8.Y = null;
                            if (r68.a) {
                                cj8.Y = null;
                                return;
                            }
                            throw new IllegalStateException("onLoadChildren must call detach() or sendResult() before returning for package=" + s68.a + " id=" + str);
                        }
                    }
                } else {
                    return;
                }
            case 1:
                fld fld = (fld) this.Y;
                ArrayList arrayList = fld.s0;
                WeakHashMap weakHashMap = zmf.a;
                View view = (View) this.b;
                arrayList.remove(omf.k(view));
                fld.t0.add(new eld(view, (ViewGroup) view.getParent()));
                ((ViewGroup) view.getParent()).removeView(view);
                if (fld.s0.size() == 0) {
                    View view2 = (View) this.c;
                    view2.getViewTreeObserver().removeOnPreDrawListener((ViewTreeObserver.OnPreDrawListener) this.o);
                    view2.setVisibility(4);
                    ((i50) this.X).g();
                    return;
                }
                return;
            default:
                try {
                    if (!(((dcd) this.b).a instanceof r0)) {
                        String uuid = ((UUID) this.c).toString();
                        h8g l = ((k7g) this.Y).c.l(uuid);
                        if (l == null || l.b.a()) {
                            throw new IllegalStateException("Calls to setForegroundAsync() must complete before a ListenableWorker signals completion of work by returning an instance of Result.");
                        }
                        ((y9b) ((k7g) this.Y).b).g(uuid, (ay5) this.o);
                        ((Context) this.X).startService(uhe.c((Context) this.X, ju0.n(l), (ay5) this.o));
                    }
                    ((dcd) this.b).j((Object) null);
                    return;
                } catch (Throwable th) {
                    ((dcd) this.b).k(th);
                    return;
                }
        }
    }
}
