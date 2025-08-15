package androidx.camera.core.internal.compat.quirk;

import java.util.Iterator;

public interface SurfaceProcessingQuirk extends vrb {
    static boolean d(bj6 bj6) {
        Iterator it = bj6.f(SurfaceProcessingQuirk.class).iterator();
        while (it.hasNext()) {
            if (((SurfaceProcessingQuirk) it.next()).b()) {
                return true;
            }
        }
        return false;
    }

    boolean b() {
        return true;
    }
}
