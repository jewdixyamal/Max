package defpackage;

import android.graphics.Bitmap;
import android.util.SparseIntArray;
import androidx.work.WorkRequest;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import one.me.rlottie.RLottie;

/* renamed from: ge  reason: default package */
public final /* synthetic */ class ge implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ ArrayList b;

    public /* synthetic */ ge(ArrayList arrayList, int i) {
        this.a = i;
        this.b = arrayList;
    }

    public final void run() {
        il4 il4;
        switch (this.a) {
            case 0:
                ((ScheduledExecutorService) ((khe) tu0.l.f.b).getValue()).schedule(new ge(this.b, 1), 36, TimeUnit.MILLISECONDS);
                return;
            case 1:
                int i = 0;
                while (true) {
                    ArrayList arrayList = this.b;
                    if (i < arrayList.size()) {
                        Bitmap bitmap = (Bitmap) ((WeakReference) arrayList.get(i)).get();
                        ((WeakReference) arrayList.get(i)).clear();
                        if (bitmap != null && !bitmap.isRecycled()) {
                            try {
                                bitmap.recycle();
                            } catch (Throwable th) {
                                RLottie.getLogger().o(th);
                            }
                        }
                        i++;
                    } else {
                        return;
                    }
                }
            case 2:
                Iterator it = this.b.iterator();
                while (it.hasNext()) {
                    ((Bitmap) it.next()).recycle();
                }
                return;
            case 3:
                ml4 ml4 = ml4.k;
                ml4.getClass();
                int i2 = 0;
                while (true) {
                    ArrayList arrayList2 = this.b;
                    if (i2 < arrayList2.size()) {
                        Runnable runnable = (Runnable) arrayList2.get(i2);
                        if (runnable != null) {
                            ArrayList arrayList3 = ml4.c;
                            boolean isEmpty = arrayList3.isEmpty();
                            ArrayList arrayList4 = ml4.a;
                            if (!isEmpty && (ml4.g / 2 <= arrayList3.size() || (arrayList4.isEmpty() && ml4.e >= ml4.d))) {
                                il4 = (il4) arrayList3.remove(0);
                            } else if (arrayList4.isEmpty()) {
                                il4 = new il4("rlottie-bg-pool" + ml4.f + "-" + ll4.j.nextInt());
                                il4.setPriority(10);
                                ml4.e = ml4.e + 1;
                            } else {
                                il4 = (il4) arrayList4.remove(0);
                            }
                            if (!ml4.h) {
                                ((ScheduledExecutorService) ((khe) tu0.l.f.b).getValue()).schedule(ml4.i, WorkRequest.DEFAULT_BACKOFF_DELAY_MILLIS, TimeUnit.MILLISECONDS);
                                ml4.h = true;
                            }
                            ml4.g++;
                            arrayList3.add(il4);
                            SparseIntArray sparseIntArray = ml4.b;
                            sparseIntArray.put(il4.o, sparseIntArray.get(il4.o, 0) + 1);
                            if (il4.getPriority() != 10) {
                                il4.setPriority(10);
                            }
                            il4.b(new f5((Object) ml4, (Object) runnable, (Object) il4, 21));
                        }
                        i2++;
                    } else {
                        arrayList2.clear();
                        he.d(new ge(arrayList2, 4));
                        return;
                    }
                }
                break;
            default:
                ml4.l.add(this.b);
                return;
        }
    }
}
