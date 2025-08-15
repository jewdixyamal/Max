package defpackage;

import android.graphics.Bitmap;
import android.text.Editable;
import android.text.Selection;
import android.text.TextPaint;
import android.view.KeyEvent;
import java.nio.ByteBuffer;
import java.util.Iterator;
import java.util.Set;

/* renamed from: te  reason: default package */
public final class te implements qj3 {
    public static final lh4 Y = new Object();
    public final Object X;
    public final boolean a;
    public final Object b;
    public Object c;
    public Object o;

    public /* synthetic */ te(Object obj, Object obj2, Object obj3, Object obj4, boolean z) {
        this.b = obj;
        this.c = obj2;
        this.o = obj3;
        this.X = obj4;
        this.a = z;
    }

    public static boolean a(Editable editable, KeyEvent keyEvent, boolean z) {
        c4f[] c4fArr;
        if (!KeyEvent.metaStateHasNoModifiers(keyEvent.getMetaState())) {
            return false;
        }
        int selectionStart = Selection.getSelectionStart(editable);
        int selectionEnd = Selection.getSelectionEnd(editable);
        if (!(selectionStart == -1 || selectionEnd == -1 || selectionStart != selectionEnd || (c4fArr = (c4f[]) editable.getSpans(selectionStart, selectionEnd, c4f.class)) == null || c4fArr.length <= 0)) {
            int length = c4fArr.length;
            int i = 0;
            while (i < length) {
                c4f c4f = c4fArr[i];
                int spanStart = editable.getSpanStart(c4f);
                int spanEnd = editable.getSpanEnd(c4f);
                if ((!z || spanStart != selectionStart) && ((z || spanEnd != selectionStart) && (selectionStart <= spanStart || selectionStart >= spanEnd))) {
                    i++;
                } else {
                    editable.delete(spanStart, spanEnd);
                    return true;
                }
            }
        }
        return false;
    }

    public void accept(Object obj) {
        CharSequence charSequence = (CharSequence) obj;
        if (charSequence.length() != 0 && !charSequence.equals((CharSequence) this.b)) {
            ((k29) this.c).a((e52) this.o, (es8) this.X, charSequence, this.a);
        }
    }

    public boolean b(CharSequence charSequence, int i, int i2, b4f b4f) {
        if ((b4f.c & 3) == 0) {
            sw4 sw4 = (sw4) this.o;
            l99 c2 = b4f.c();
            int a2 = c2.a(8);
            if (a2 != 0) {
                ((ByteBuffer) c2.o).getShort(a2 + c2.a);
            }
            ya4 ya4 = (ya4) sw4;
            ya4.getClass();
            ThreadLocal threadLocal = ya4.b;
            if (threadLocal.get() == null) {
                threadLocal.set(new StringBuilder());
            }
            StringBuilder sb = (StringBuilder) threadLocal.get();
            sb.setLength(0);
            while (i < i2) {
                sb.append(charSequence.charAt(i));
                i++;
            }
            TextPaint textPaint = ya4.a;
            String sb2 = sb.toString();
            int i3 = jpa.a;
            boolean a3 = ipa.a(textPaint, sb2);
            int i4 = b4f.c & 4;
            b4f.c = a3 ? i4 | 2 : i4 | 1;
        }
        return (b4f.c & 3) == 2;
    }

    /* JADX WARNING: Removed duplicated region for block: B:37:0x0094  */
    /* JADX WARNING: Removed duplicated region for block: B:75:0x00c0 A[SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.Object c(java.lang.CharSequence r17, int r18, int r19, int r20, boolean r21, defpackage.xx4 r22) {
        /*
            r16 = this;
            r0 = r16
            r1 = r17
            r2 = r19
            r3 = r20
            r4 = r22
            zx4 r5 = new zx4
            java.lang.Object r6 = r0.c
            t99 r6 = (defpackage.t99) r6
            s99 r6 = r6.c
            boolean r7 = r0.a
            java.lang.Object r8 = r0.X
            int[] r8 = (int[]) r8
            r5.<init>(r6, r7, r8)
            int r6 = java.lang.Character.codePointAt(r17, r18)
            r7 = 1
            r8 = 0
            r9 = r6
            r11 = r7
            r10 = r8
            r6 = r18
        L_0x0026:
            r8 = r6
        L_0x0027:
            r12 = 2
            if (r6 >= r2) goto L_0x00d2
            if (r10 >= r3) goto L_0x00d2
            if (r11 == 0) goto L_0x00d2
            s99 r13 = r5.c
            android.util.SparseArray r13 = r13.a
            if (r13 != 0) goto L_0x0036
            r13 = 0
            goto L_0x003c
        L_0x0036:
            java.lang.Object r13 = r13.get(r9)
            s99 r13 = (defpackage.s99) r13
        L_0x003c:
            int r14 = r5.a
            r15 = 3
            if (r14 == r12) goto L_0x0050
            if (r13 != 0) goto L_0x0048
            r5.a()
        L_0x0046:
            r13 = r7
            goto L_0x0090
        L_0x0048:
            r5.a = r12
            r5.c = r13
            r5.f = r7
        L_0x004e:
            r13 = r12
            goto L_0x0090
        L_0x0050:
            if (r13 == 0) goto L_0x005a
            r5.c = r13
            int r13 = r5.f
            int r13 = r13 + r7
            r5.f = r13
            goto L_0x004e
        L_0x005a:
            r13 = 65038(0xfe0e, float:9.1138E-41)
            if (r9 != r13) goto L_0x0063
            r5.a()
            goto L_0x0046
        L_0x0063:
            r13 = 65039(0xfe0f, float:9.1139E-41)
            if (r9 != r13) goto L_0x0069
            goto L_0x004e
        L_0x0069:
            s99 r13 = r5.c
            b4f r14 = r13.b
            if (r14 == 0) goto L_0x008c
            int r14 = r5.f
            if (r14 != r7) goto L_0x0086
            boolean r13 = r5.b()
            if (r13 == 0) goto L_0x0082
            s99 r13 = r5.c
            r5.d = r13
            r5.a()
        L_0x0080:
            r13 = r15
            goto L_0x0090
        L_0x0082:
            r5.a()
            goto L_0x0046
        L_0x0086:
            r5.d = r13
            r5.a()
            goto L_0x0080
        L_0x008c:
            r5.a()
            goto L_0x0046
        L_0x0090:
            r5.e = r9
            if (r13 == r7) goto L_0x00c0
            if (r13 == r12) goto L_0x00b1
            if (r13 == r15) goto L_0x0099
            goto L_0x0027
        L_0x0099:
            if (r21 != 0) goto L_0x00a5
            s99 r12 = r5.d
            b4f r12 = r12.b
            boolean r12 = r0.b(r1, r8, r6, r12)
            if (r12 != 0) goto L_0x0026
        L_0x00a5:
            s99 r11 = r5.d
            b4f r11 = r11.b
            boolean r11 = r4.k(r1, r8, r6, r11)
            int r10 = r10 + 1
            goto L_0x0026
        L_0x00b1:
            int r12 = java.lang.Character.charCount(r9)
            int r12 = r12 + r6
            if (r12 >= r2) goto L_0x00bd
            int r6 = java.lang.Character.codePointAt(r1, r12)
            r9 = r6
        L_0x00bd:
            r6 = r12
            goto L_0x0027
        L_0x00c0:
            int r6 = java.lang.Character.codePointAt(r1, r8)
            int r6 = java.lang.Character.charCount(r6)
            int r6 = r6 + r8
            if (r6 >= r2) goto L_0x0026
            int r8 = java.lang.Character.codePointAt(r1, r6)
            r9 = r8
            goto L_0x0026
        L_0x00d2:
            int r2 = r5.a
            if (r2 != r12) goto L_0x00fd
            s99 r2 = r5.c
            b4f r2 = r2.b
            if (r2 == 0) goto L_0x00fd
            int r2 = r5.f
            if (r2 > r7) goto L_0x00e6
            boolean r2 = r5.b()
            if (r2 == 0) goto L_0x00fd
        L_0x00e6:
            if (r10 >= r3) goto L_0x00fd
            if (r11 == 0) goto L_0x00fd
            if (r21 != 0) goto L_0x00f6
            s99 r2 = r5.c
            b4f r2 = r2.b
            boolean r0 = r0.b(r1, r8, r6, r2)
            if (r0 != 0) goto L_0x00fd
        L_0x00f6:
            s99 r0 = r5.c
            b4f r0 = r0.b
            r4.k(r1, r8, r6, r0)
        L_0x00fd:
            java.lang.Object r0 = r22.h()
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.te.c(java.lang.CharSequence, int, int, int, boolean, xx4):java.lang.Object");
    }

    public boolean d(Bitmap bitmap, int i) {
        try {
            ((w36) this.o).v(bitmap, i);
            return true;
        } catch (IllegalStateException e) {
            if (!ta5.a.i(6)) {
                return false;
            }
            ft7 ft7 = ta5.a;
            String simpleName = te.class.getSimpleName();
            ft7.e(simpleName, "Rendering of frame unsuccessful. Frame number: " + i, e);
            return false;
        }
    }

    public te(wn0 wn0, ue ueVar, boolean z) {
        this.b = wn0;
        this.c = ueVar;
        this.a = z;
        fd7 fd7 = new fd7(this);
        this.X = fd7;
        this.o = new w36(ueVar, z, fd7);
    }

    public te(t99 t99, kj6 kj6, sw4 sw4, boolean z, int[] iArr, Set set) {
        this.b = kj6;
        this.c = t99;
        this.o = sw4;
        this.a = z;
        this.X = iArr;
        if (!set.isEmpty()) {
            Iterator it = set.iterator();
            while (it.hasNext()) {
                int[] iArr2 = (int[]) it.next();
                String str = new String(iArr2, 0, iArr2.length);
                c(str, 0, str.length(), 1, true, new yx4(str));
            }
        }
    }
}
