package defpackage;

/* renamed from: sqc  reason: default package */
public abstract class sqc extends i87 {
    public d87 dequeueWork() {
        try {
            b87 b87 = this.mJobImpl;
            if (b87 != null) {
                return b87.b();
            }
            synchronized (this.mCompatQueue) {
                if (this.mCompatQueue.size() <= 0) {
                    return null;
                }
                d87 remove = this.mCompatQueue.remove(0);
                return remove;
            }
        } catch (SecurityException e) {
            e.printStackTrace();
            return null;
        } catch (Throwable th) {
            throw th;
        }
    }

    public void onCreate() {
        super.onCreate();
        this.mJobImpl = new f87(this, 1);
    }
}
