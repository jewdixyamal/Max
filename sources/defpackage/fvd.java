package defpackage;

import android.text.Editable;
import android.text.SpannableStringBuilder;
import java.lang.reflect.Array;
import java.util.ArrayList;

/* renamed from: fvd  reason: default package */
public final class fvd extends SpannableStringBuilder {
    public final Class a;
    public final ArrayList b = new ArrayList();

    public fvd(Class cls, CharSequence charSequence) {
        super(charSequence);
        c54.o(cls, "watcherClass cannot be null");
        this.a = cls;
    }

    public final void a() {
        int i = 0;
        while (true) {
            ArrayList arrayList = this.b;
            if (i < arrayList.size()) {
                ((evd) arrayList.get(i)).b.incrementAndGet();
                i++;
            } else {
                return;
            }
        }
    }

    public final Editable append(CharSequence charSequence) {
        super.append(charSequence);
        return this;
    }

    public final void b() {
        e();
        int i = 0;
        while (true) {
            ArrayList arrayList = this.b;
            if (i < arrayList.size()) {
                ((evd) arrayList.get(i)).onTextChanged(this, 0, length(), length());
                i++;
            } else {
                return;
            }
        }
    }

    public final evd c(Object obj) {
        int i = 0;
        while (true) {
            ArrayList arrayList = this.b;
            if (i >= arrayList.size()) {
                return null;
            }
            evd evd = (evd) arrayList.get(i);
            if (evd.a == obj) {
                return evd;
            }
            i++;
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:1:0x0002, code lost:
        r1 = r1.getClass();
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean d(java.lang.Object r1) {
        /*
            r0 = this;
            if (r1 == 0) goto L_0x000c
            java.lang.Class r1 = r1.getClass()
            java.lang.Class r0 = r0.a
            if (r0 != r1) goto L_0x000c
            r0 = 1
            goto L_0x000d
        L_0x000c:
            r0 = 0
        L_0x000d:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.fvd.d(java.lang.Object):boolean");
    }

    public final Editable delete(int i, int i2) {
        super.delete(i, i2);
        return this;
    }

    public final void e() {
        int i = 0;
        while (true) {
            ArrayList arrayList = this.b;
            if (i < arrayList.size()) {
                ((evd) arrayList.get(i)).b.decrementAndGet();
                i++;
            } else {
                return;
            }
        }
    }

    public final int getSpanEnd(Object obj) {
        evd c;
        if (d(obj) && (c = c(obj)) != null) {
            obj = c;
        }
        return super.getSpanEnd(obj);
    }

    public final int getSpanFlags(Object obj) {
        evd c;
        if (d(obj) && (c = c(obj)) != null) {
            obj = c;
        }
        return super.getSpanFlags(obj);
    }

    public final int getSpanStart(Object obj) {
        evd c;
        if (d(obj) && (c = c(obj)) != null) {
            obj = c;
        }
        return super.getSpanStart(obj);
    }

    public final Object[] getSpans(int i, int i2, Class cls) {
        if (this.a != cls) {
            return super.getSpans(i, i2, cls);
        }
        evd[] evdArr = (evd[]) super.getSpans(i, i2, evd.class);
        Object[] objArr = (Object[]) Array.newInstance(cls, evdArr.length);
        for (int i3 = 0; i3 < evdArr.length; i3++) {
            objArr[i3] = evdArr[i3].a;
        }
        return objArr;
    }

    public final Editable insert(int i, CharSequence charSequence) {
        super.insert(i, charSequence);
        return this;
    }

    public final int nextSpanTransition(int i, int i2, Class<evd> cls) {
        if (cls == null || this.a == cls) {
            cls = evd.class;
        }
        return super.nextSpanTransition(i, i2, cls);
    }

    public final void removeSpan(Object obj) {
        evd evd;
        if (d(obj)) {
            evd = c(obj);
            if (evd != null) {
                obj = evd;
            }
        } else {
            evd = null;
        }
        super.removeSpan(obj);
        if (evd != null) {
            this.b.remove(evd);
        }
    }

    public final void setSpan(Object obj, int i, int i2, int i3) {
        if (d(obj)) {
            evd evd = new evd(obj);
            this.b.add(evd);
            obj = evd;
        }
        super.setSpan(obj, i, i2, i3);
    }

    public final CharSequence subSequence(int i, int i2) {
        return new fvd(this.a, this, i, i2);
    }

    /* renamed from: append  reason: collision with other method in class */
    public final SpannableStringBuilder m10append(CharSequence charSequence) {
        super.append(charSequence);
        return this;
    }

    /* renamed from: delete  reason: collision with other method in class */
    public final SpannableStringBuilder m15delete(int i, int i2) {
        super.delete(i, i2);
        return this;
    }

    /* renamed from: insert  reason: collision with other method in class */
    public final SpannableStringBuilder m16insert(int i, CharSequence charSequence) {
        super.insert(i, charSequence);
        return this;
    }

    /* renamed from: append  reason: collision with other method in class */
    public final Appendable m13append(CharSequence charSequence) {
        super.append(charSequence);
        return this;
    }

    public final Editable insert(int i, CharSequence charSequence, int i2, int i3) {
        super.insert(i, charSequence, i2, i3);
        return this;
    }

    public final SpannableStringBuilder replace(int i, int i2, CharSequence charSequence) {
        a();
        super.replace(i, i2, charSequence);
        e();
        return this;
    }

    public final Editable append(char c) {
        super.append(c);
        return this;
    }

    /* renamed from: insert  reason: collision with other method in class */
    public final SpannableStringBuilder m17insert(int i, CharSequence charSequence, int i2, int i3) {
        super.insert(i, charSequence, i2, i3);
        return this;
    }

    public fvd(Class cls, CharSequence charSequence, int i, int i2) {
        super(charSequence, i, i2);
        c54.o(cls, "watcherClass cannot be null");
        this.a = cls;
    }

    /* renamed from: append  reason: collision with other method in class */
    public final SpannableStringBuilder m9append(char c) {
        super.append(c);
        return this;
    }

    /* renamed from: append  reason: collision with other method in class */
    public final Appendable m12append(char c) {
        super.append(c);
        return this;
    }

    public final SpannableStringBuilder replace(int i, int i2, CharSequence charSequence, int i3, int i4) {
        a();
        super.replace(i, i2, charSequence, i3, i4);
        e();
        return this;
    }

    public final Editable append(CharSequence charSequence, int i, int i2) {
        super.append(charSequence, i, i2);
        return this;
    }

    /* renamed from: append  reason: collision with other method in class */
    public final SpannableStringBuilder m11append(CharSequence charSequence, int i, int i2) {
        super.append(charSequence, i, i2);
        return this;
    }

    /* renamed from: append  reason: collision with other method in class */
    public final Appendable m14append(CharSequence charSequence, int i, int i2) {
        super.append(charSequence, i, i2);
        return this;
    }

    public final SpannableStringBuilder append(CharSequence charSequence, Object obj, int i) {
        super.append(charSequence, obj, i);
        return this;
    }
}
