package defpackage;

import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import java.lang.ref.WeakReference;
import java.util.WeakHashMap;
import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: cia  reason: default package */
public abstract class cia {
    public static final Handler a = new Handler(Looper.getMainLooper(), new Object());
    public static bia b;
    public static bia c;
    public static final AtomicBoolean d = new AtomicBoolean(false);

    public static void a(bia bia, yha yha) {
        WeakReference weakReference;
        zha zha;
        if (bia != null && (weakReference = bia.b) != null && (zha = (zha) weakReference.get()) != null) {
            a.removeCallbacksAndMessages(zha);
            zha.a.b(yha);
        }
    }

    public static void b(zha zha, yha yha) {
        AtomicBoolean atomicBoolean = d;
        boolean z = false;
        if (atomicBoolean.compareAndSet(false, true)) {
            atomicBoolean.set(false);
            bia bia = b;
            if (bia != null ? tpa.f(bia.b.get(), zha) : false) {
                a(b, yha);
                return;
            }
            bia bia2 = c;
            if (bia2 != null) {
                z = tpa.f(bia2.b.get(), zha);
            }
            if (z) {
                a(c, yha);
            }
        }
    }

    public static void c(bia bia) {
        iia iia;
        if (!tpa.f(bia != null ? bia.a : null, fia.b)) {
            Handler handler = a;
            handler.removeCallbacksAndMessages(bia);
            if (bia == null || (iia = bia.a) == null) {
                iia = gia.b;
            }
            handler.sendMessageDelayed(Message.obtain(handler, 0, bia), iia.a);
        }
    }

    /* JADX WARNING: type inference failed for: r6v2, types: [java.lang.Object, mec] */
    public static void d() {
        zha zha;
        wia wia;
        bia bia = c;
        if (bia != null) {
            b = bia;
            uge uge = null;
            c = null;
            WeakReference weakReference = bia.b;
            if (weakReference == null || (zha = (zha) weakReference.get()) == null) {
                b = null;
                return;
            }
            i50 i50 = zha.a;
            uge uge2 = (uge) i50.X;
            boolean z = false;
            if (uge2 != null) {
                uge2.d();
            } else {
                WeakReference weakReference2 = (WeakReference) i50.c;
                if (uge2 == null) {
                    ViewGroup viewGroup = (ViewGroup) weakReference2.get();
                    Context context = viewGroup != null ? viewGroup.getContext() : null;
                    if (context != null) {
                        uia uia = (uia) i50.o;
                        ViewGroup viewGroup2 = (ViewGroup) weakReference2.get();
                        Context context2 = viewGroup2 != null ? viewGroup2.getContext() : null;
                        if (context2 == null) {
                            wia = null;
                        } else {
                            wia = new wia(context2, (AttributeSet) null);
                            wia.setTitle(uia.b);
                            wia.setCaption(uia.c);
                            wia.setLeftElement(uia.a);
                            tia tia = uia.o;
                            wia.setRightElement(tia);
                            if (tia instanceof ria) {
                                wia.setRightBtnAction$snackbar_release((View.OnClickListener) null);
                            } else {
                                wia.setRightBtnAction$snackbar_release(new xx5(21, i50));
                            }
                        }
                        if (wia != null) {
                            uge = new uge(context);
                            ? obj = new Object();
                            FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, -2);
                            eia eia = ((uia) i50.o).X;
                            int i = eia.a;
                            layoutParams.gravity = (i & 1) != 0 ? 48 : 80;
                            if ((i & 1) != 0) {
                                layoutParams.topMargin = eia.b;
                            } else {
                                layoutParams.bottomMargin = eia.c;
                            }
                            uge.setLayoutParams(layoutParams);
                            if (uge.isAttachedToWindow()) {
                                uge.requestApplyInsets();
                            } else {
                                uge.addOnAttachStateChangeListener(new o50(uge, 6, uge));
                            }
                            int i2 = vc7.a;
                            i50.b = vc7.b(vc7.c);
                            y98 y98 = new y98((Object) i50, 18, (Object) context);
                            WeakHashMap weakHashMap = zmf.a;
                            omf.u(uge, y98);
                            uge.addView(wia);
                            float f = (float) 12;
                            uge.setPadding(tu0.G(fk4.d().getDisplayMetrics().density * f), tu0.G(((float) 0) * fk4.d().getDisplayMetrics().density), tu0.G(fk4.d().getDisplayMetrics().density * f), tu0.G(f * fk4.d().getDisplayMetrics().density));
                            uge.setClipToPadding(false);
                            uge.setClipChildren(false);
                            uge.setClipToOutline(false);
                            uge.setElevation(10.0f);
                            uge.setCallback(new c8d(i50, obj, wia, uge));
                            obj.a = pla.a(uge, new xp1(uge, uge, 1));
                            i50.X = uge;
                        }
                    }
                    uge2 = uge;
                }
                if (uge2 != null) {
                    ViewGroup viewGroup3 = (ViewGroup) weakReference2.get();
                    if (viewGroup3 != null) {
                        viewGroup3.addView(uge2);
                    }
                    ViewGroup viewGroup4 = (ViewGroup) weakReference2.get();
                    if (viewGroup4 != null) {
                        viewGroup4.addOnAttachStateChangeListener((ck) i50.Z);
                    }
                }
            }
            if (d.compareAndSet(true, false)) {
                bia bia2 = b;
                if (bia2 != null) {
                    z = tpa.f(bia2.b.get(), (zha) i50.s0);
                }
                if (z) {
                    c(b);
                }
            }
        }
    }
}
