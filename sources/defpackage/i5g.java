package defpackage;

import android.view.View;
import java.lang.ref.WeakReference;
import one.me.sdk.arch.Widget;

/* renamed from: i5g  reason: default package */
public final class i5g extends su3 {
    public boolean a;
    public final /* synthetic */ Widget b;

    public i5g(Widget widget) {
        this.b = widget;
    }

    public final void d(uu3 uu3) {
        Widget widget = this.b;
        View requireView = widget.requireView();
        widget.onViewCreated(requireView);
        br7.d(requireView, widget.getInsetsConfig(), new b5g(widget, 1));
    }

    public final void j(uu3 uu3, View view) {
        boolean B = nd7.B(uu3);
        Widget widget = this.b;
        if (!B) {
            widget.onViewCreated(view);
            br7.d(view, widget.getInsetsConfig(), new b5g(widget, 1));
        }
        view.addOnAttachStateChangeListener(new o50(widget, 15, this));
    }

    public final void k(uu3 uu3) {
        w5g viewModelStore$arch_release;
        Widget widget = uu3 instanceof Widget ? (Widget) uu3 : null;
        if (widget != null && (viewModelStore$arch_release = widget.getViewModelStore$arch_release()) != null) {
            qi9 qi9 = viewModelStore$arch_release.a;
            Object[] objArr = qi9.c;
            long[] jArr = qi9.a;
            int length = jArr.length - 2;
            if (length >= 0) {
                int i = 0;
                while (true) {
                    long j = jArr[i];
                    if ((((~j) << 7) & j & -9187201950435737472L) != -9187201950435737472L) {
                        int i2 = 8 - ((~(i - length)) >>> 31);
                        for (int i3 = 0; i3 < i2; i3++) {
                            if ((255 & j) < 128) {
                                pnf pnf = (pnf) objArr[(i << 3) + i3];
                                pag.d(pnf.a.getCoroutineContext());
                                pnf.p();
                            }
                            j >>= 8;
                        }
                        if (i2 != 8) {
                            break;
                        }
                    }
                    if (i == length) {
                        break;
                    }
                    i++;
                }
            }
            qi9.a();
            viewModelStore$arch_release.b.a();
        }
    }

    public final void l(uu3 uu3) {
        Widget widget = this.b;
        qi9 cleanActions$arch_release = widget.getCleanActions$arch_release();
        Object[] objArr = cleanActions$arch_release.c;
        long[] jArr = cleanActions$arch_release.a;
        int length = jArr.length - 2;
        if (length >= 0) {
            int i = 0;
            while (true) {
                long j = jArr[i];
                if ((((~j) << 7) & j & -9187201950435737472L) != -9187201950435737472L) {
                    int i2 = 8 - ((~(i - length)) >>> 31);
                    for (int i3 = 0; i3 < i2; i3++) {
                        if ((255 & j) < 128) {
                            pm0 pm0 = (pm0) ((l23) objArr[(i << 3) + i3]);
                            pm0.getClass();
                            qm0 qm0 = pm0.b;
                            qm0.X = new WeakReference(qm0.o);
                            qm0.o = null;
                            pm0.a = true;
                        }
                        j >>= 8;
                    }
                    if (i2 != 8) {
                        break;
                    }
                }
                if (i == length) {
                    break;
                }
                i++;
            }
        }
        if (this.a) {
            widget.finalizeCleanActions(uu3);
        }
    }

    public final void n(uu3 uu3, View view) {
        view.addOnAttachStateChangeListener(new ck(12, this.b));
    }
}
