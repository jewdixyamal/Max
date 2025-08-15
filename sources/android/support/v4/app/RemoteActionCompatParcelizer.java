package android.support.v4.app;

import androidx.core.app.RemoteActionCompat;

public final class RemoteActionCompatParcelizer extends androidx.core.app.RemoteActionCompatParcelizer {
    public static RemoteActionCompat read(jcf jcf) {
        return androidx.core.app.RemoteActionCompatParcelizer.read(jcf);
    }

    public static void write(RemoteActionCompat remoteActionCompat, jcf jcf) {
        androidx.core.app.RemoteActionCompatParcelizer.write(remoteActionCompat, jcf);
    }
}
