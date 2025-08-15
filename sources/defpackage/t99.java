package defpackage;

import android.graphics.Typeface;
import java.nio.ByteBuffer;
import kotlinx.coroutines.internal.LockFreeTaskQueueCore;

/* renamed from: t99  reason: default package */
public final class t99 {
    public final m99 a;
    public final char[] b;
    public final s99 c = new s99(LockFreeTaskQueueCore.MIN_ADD_SPIN_CAPACITY);
    public final Typeface d;

    public t99(Typeface typeface, m99 m99) {
        int i;
        int i2;
        this.d = typeface;
        this.a = m99;
        int a2 = m99.a(6);
        if (a2 != 0) {
            int i3 = a2 + m99.a;
            i = ((ByteBuffer) m99.o).getInt(((ByteBuffer) m99.o).getInt(i3) + i3);
        } else {
            i = 0;
        }
        this.b = new char[(i * 2)];
        int a3 = m99.a(6);
        if (a3 != 0) {
            int i4 = a3 + m99.a;
            i2 = ((ByteBuffer) m99.o).getInt(((ByteBuffer) m99.o).getInt(i4) + i4);
        } else {
            i2 = 0;
        }
        for (int i5 = 0; i5 < i2; i5++) {
            b4f b4f = new b4f(this, i5);
            l99 c2 = b4f.c();
            int a4 = c2.a(4);
            Character.toChars(a4 != 0 ? ((ByteBuffer) c2.o).getInt(a4 + c2.a) : 0, this.b, i5 * 2);
            c54.j("invalid metadata codepoint length", b4f.b() > 0);
            this.c.a(b4f, 0, b4f.b() - 1);
        }
    }
}
