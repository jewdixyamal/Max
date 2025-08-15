package defpackage;

import java.io.BufferedReader;
import java.util.Iterator;
import java.util.NoSuchElementException;

/* renamed from: ai7  reason: default package */
public final class ai7 implements Iterator, qb7 {
    public String a;
    public boolean b;
    public final /* synthetic */ at c;

    public ai7(at atVar) {
        this.c = atVar;
    }

    public final boolean hasNext() {
        if (this.a == null && !this.b) {
            String readLine = ((BufferedReader) this.c.b).readLine();
            this.a = readLine;
            if (readLine == null) {
                this.b = true;
            }
        }
        return this.a != null;
    }

    public final Object next() {
        if (hasNext()) {
            String str = this.a;
            this.a = null;
            return str;
        }
        throw new NoSuchElementException();
    }

    public final void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
