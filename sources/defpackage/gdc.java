package defpackage;

import android.view.View;
import android.view.ViewPropertyAnimator;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.WeakHashMap;

/* renamed from: gdc  reason: default package */
public final class gdc implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ RecyclerView b;

    public /* synthetic */ gdc(RecyclerView recyclerView, int i) {
        this.a = i;
        this.b = recyclerView;
    }

    public final void run() {
        RecyclerView recyclerView = this.b;
        switch (this.a) {
            case 0:
                if (recyclerView.I0 && !recyclerView.isLayoutRequested()) {
                    if (!recyclerView.G0) {
                        recyclerView.requestLayout();
                        return;
                    } else if (recyclerView.L0) {
                        recyclerView.K0 = true;
                        return;
                    } else {
                        recyclerView.s();
                        return;
                    }
                } else {
                    return;
                }
            default:
                mdc mdc = recyclerView.a1;
                if (mdc != null) {
                    yb4 yb4 = (yb4) mdc;
                    ArrayList arrayList = yb4.h;
                    boolean z = !arrayList.isEmpty();
                    ArrayList arrayList2 = yb4.j;
                    boolean z2 = !arrayList2.isEmpty();
                    ArrayList arrayList3 = yb4.k;
                    boolean z3 = !arrayList3.isEmpty();
                    ArrayList arrayList4 = yb4.i;
                    boolean z4 = !arrayList4.isEmpty();
                    if (z || z2 || z4 || z3) {
                        Iterator it = arrayList.iterator();
                        while (it.hasNext()) {
                            dec dec = (dec) it.next();
                            View view = dec.a;
                            ViewPropertyAnimator animate = view.animate();
                            yb4.q.add(dec);
                            animate.setDuration(yb4.d).alpha(0.0f).setListener(new tb4(yb4, dec, animate, view)).start();
                            arrayList = arrayList;
                        }
                        arrayList.clear();
                        if (z2) {
                            ArrayList arrayList5 = new ArrayList();
                            arrayList5.addAll(arrayList2);
                            yb4.m.add(arrayList5);
                            arrayList2.clear();
                            sb4 sb4 = new sb4(yb4, arrayList5, 0);
                            if (z) {
                                View view2 = ((xb4) arrayList5.get(0)).a.a;
                                long j = yb4.d;
                                WeakHashMap weakHashMap = zmf.a;
                                view2.postOnAnimationDelayed(sb4, j);
                            } else {
                                sb4.run();
                            }
                        }
                        if (z3) {
                            ArrayList arrayList6 = new ArrayList();
                            arrayList6.addAll(arrayList3);
                            yb4.n.add(arrayList6);
                            arrayList3.clear();
                            h76 h76 = new h76((Object) yb4, (Object) arrayList6, false, 4);
                            if (z) {
                                View view3 = ((wb4) arrayList6.get(0)).a.a;
                                long j2 = yb4.d;
                                WeakHashMap weakHashMap2 = zmf.a;
                                view3.postOnAnimationDelayed(h76, j2);
                            } else {
                                h76.run();
                            }
                        }
                        if (z4) {
                            ArrayList arrayList7 = new ArrayList();
                            arrayList7.addAll(arrayList4);
                            yb4.l.add(arrayList7);
                            arrayList4.clear();
                            sb4 sb42 = new sb4(yb4, arrayList7, 1);
                            if (z || z2 || z3) {
                                long j3 = 0;
                                long j4 = z ? yb4.d : 0;
                                long j5 = z2 ? yb4.e : 0;
                                if (z3) {
                                    j3 = yb4.f;
                                }
                                View view4 = ((dec) arrayList7.get(0)).a;
                                WeakHashMap weakHashMap3 = zmf.a;
                                view4.postOnAnimationDelayed(sb42, Math.max(j5, j3) + j4);
                            } else {
                                sb42.run();
                            }
                        }
                    }
                }
                recyclerView.y1 = false;
                return;
        }
    }
}
