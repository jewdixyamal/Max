package defpackage;

/* renamed from: u84  reason: default package */
public abstract class u84 extends ei0 {
    public final void finalize() {
        if (!isClosed()) {
            ta5.m("CloseableImage", "finalize: %s %x still open.", getClass().getSimpleName(), Integer.valueOf(System.identityHashCode(this)));
            try {
                close();
            } finally {
                super.finalize();
            }
        }
    }
}
