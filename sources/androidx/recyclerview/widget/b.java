package androidx.recyclerview.widget;

import android.util.SparseArray;
import java.util.ArrayList;
import java.util.Collections;
import java.util.IdentityHashMap;
import java.util.Iterator;
import java.util.Set;

public class b {
    private static final int DEFAULT_MAX_SCRAP = 5;
    int mAttachCountForClearing = 0;
    Set<hdc> mAttachedAdaptersForPoolingContainer = Collections.newSetFromMap(new IdentityHashMap());
    SparseArray<udc> mScrap = new SparseArray<>();

    public void attach() {
        this.mAttachCountForClearing++;
    }

    public void attachForPoolingContainer(hdc hdc) {
        this.mAttachedAdaptersForPoolingContainer.add(hdc);
    }

    public void clear() {
        for (int i = 0; i < this.mScrap.size(); i++) {
            udc valueAt = this.mScrap.valueAt(i);
            Iterator it = valueAt.a.iterator();
            while (it.hasNext()) {
                r5b.a(((dec) it.next()).a);
            }
            valueAt.a.clear();
        }
    }

    public void detach() {
        this.mAttachCountForClearing--;
    }

    public void detachForPoolingContainer(hdc hdc, boolean z) {
        this.mAttachedAdaptersForPoolingContainer.remove(hdc);
        if (this.mAttachedAdaptersForPoolingContainer.size() == 0 && !z) {
            for (int i = 0; i < this.mScrap.size(); i++) {
                SparseArray<udc> sparseArray = this.mScrap;
                ArrayList arrayList = sparseArray.get(sparseArray.keyAt(i)).a;
                for (int i2 = 0; i2 < arrayList.size(); i2++) {
                    r5b.a(((dec) arrayList.get(i2)).a);
                }
            }
        }
    }

    public void factorInBindTime(int i, long j) {
        udc scrapDataForType = getScrapDataForType(i);
        scrapDataForType.d = runningAverage(scrapDataForType.d, j);
    }

    public void factorInCreateTime(int i, long j) {
        udc scrapDataForType = getScrapDataForType(i);
        scrapDataForType.c = runningAverage(scrapDataForType.c, j);
    }

    public dec getRecycledView(int i) {
        udc udc = this.mScrap.get(i);
        if (udc == null) {
            return null;
        }
        ArrayList arrayList = udc.a;
        if (arrayList.isEmpty()) {
            return null;
        }
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            if (!((dec) arrayList.get(size)).l()) {
                return (dec) arrayList.remove(size);
            }
        }
        return null;
    }

    public final udc getScrapDataForType(int i) {
        udc udc = this.mScrap.get(i);
        if (udc != null) {
            return udc;
        }
        udc udc2 = new udc();
        this.mScrap.put(i, udc2);
        return udc2;
    }

    public void onAdapterChanged(hdc hdc, hdc hdc2, boolean z) {
        if (hdc != null) {
            detach();
        }
        if (!z && this.mAttachCountForClearing == 0) {
            clear();
        }
        if (hdc2 != null) {
            attach();
        }
    }

    public void putRecycledView(dec dec) {
        int i = dec.Y;
        ArrayList arrayList = getScrapDataForType(i).a;
        if (this.mScrap.get(i).b <= arrayList.size()) {
            r5b.a(dec.a);
        } else if (!RecyclerView.L1 || !arrayList.contains(dec)) {
            dec.u();
            arrayList.add(dec);
        } else {
            throw new IllegalArgumentException("this scrap item already exists");
        }
    }

    public long runningAverage(long j, long j2) {
        if (j == 0) {
            return j2;
        }
        return (j2 / 4) + ((j / 4) * 3);
    }

    public void setMaxRecycledViews(int i, int i2) {
        udc scrapDataForType = getScrapDataForType(i);
        scrapDataForType.b = i2;
        ArrayList arrayList = scrapDataForType.a;
        while (arrayList.size() > i2) {
            arrayList.remove(arrayList.size() - 1);
        }
    }

    public int size() {
        int i = 0;
        for (int i2 = 0; i2 < this.mScrap.size(); i2++) {
            ArrayList arrayList = this.mScrap.valueAt(i2).a;
            if (arrayList != null) {
                i = arrayList.size() + i;
            }
        }
        return i;
    }

    public boolean willBindInTime(int i, long j, long j2) {
        long j3 = getScrapDataForType(i).d;
        return j3 == 0 || j + j3 < j2;
    }

    public boolean willCreateInTime(int i, long j, long j2) {
        long j3 = getScrapDataForType(i).c;
        return j3 == 0 || j + j3 < j2;
    }
}
