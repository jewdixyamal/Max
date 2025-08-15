package defpackage;

import android.net.Uri;
import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import android.support.v4.media.session.IMediaSession;
import android.text.TextUtils;
import android.view.KeyEvent;
import java.util.List;

/* renamed from: nr6  reason: default package */
public final class nr6 implements pr6 {
    public IBinder c;

    public final void T(String str, Bundle bundle, zh8 zh8) {
        Parcel obtain = Parcel.obtain();
        Parcel obtain2 = Parcel.obtain();
        try {
            obtain.writeInterfaceToken(IMediaSession.DESCRIPTOR);
            obtain.writeString(str);
            if (bundle != null) {
                obtain.writeInt(1);
                bundle.writeToParcel(obtain, 0);
            } else {
                obtain.writeInt(0);
            }
            if (zh8 != null) {
                obtain.writeInt(1);
                zh8.writeToParcel(obtain, 0);
            } else {
                obtain.writeInt(0);
            }
            if (!this.c.transact(1, obtain, obtain2, 0)) {
                int i = uh8.d;
            }
            obtain2.readException();
            obtain2.recycle();
            obtain.recycle();
        } catch (Throwable th) {
            obtain2.recycle();
            obtain.recycle();
            throw th;
        }
    }

    public final void W(mr6 mr6) {
        Parcel obtain = Parcel.obtain();
        Parcel obtain2 = Parcel.obtain();
        try {
            obtain.writeInterfaceToken(IMediaSession.DESCRIPTOR);
            obtain.writeStrongBinder(mr6 != null ? mr6.asBinder() : null);
            if (!this.c.transact(4, obtain, obtain2, 0)) {
                int i = uh8.d;
            }
            obtain2.readException();
            obtain2.recycle();
            obtain.recycle();
        } catch (Throwable th) {
            obtain2.recycle();
            obtain.recycle();
            throw th;
        }
    }

    public final void adjustVolume(int i, int i2, String str) {
        Parcel obtain = Parcel.obtain();
        Parcel obtain2 = Parcel.obtain();
        try {
            obtain.writeInterfaceToken(IMediaSession.DESCRIPTOR);
            obtain.writeInt(i);
            obtain.writeInt(i2);
            obtain.writeString(str);
            if (!this.c.transact(11, obtain, obtain2, 0)) {
                int i3 = uh8.d;
            }
            obtain2.readException();
        } finally {
            obtain2.recycle();
            obtain.recycle();
        }
    }

    public final IBinder asBinder() {
        return this.c;
    }

    public final void fastForward() {
        Parcel obtain = Parcel.obtain();
        Parcel obtain2 = Parcel.obtain();
        try {
            obtain.writeInterfaceToken(IMediaSession.DESCRIPTOR);
            if (!this.c.transact(22, obtain, obtain2, 0)) {
                int i = uh8.d;
            }
            obtain2.readException();
        } finally {
            obtain2.recycle();
            obtain.recycle();
        }
    }

    public final void g0(mr6 mr6) {
        Parcel obtain = Parcel.obtain();
        Parcel obtain2 = Parcel.obtain();
        try {
            obtain.writeInterfaceToken(IMediaSession.DESCRIPTOR);
            obtain.writeStrongBinder(mr6 != null ? mr6.asBinder() : null);
            if (!this.c.transact(3, obtain, obtain2, 0)) {
                int i = uh8.d;
            }
            obtain2.readException();
            obtain2.recycle();
            obtain.recycle();
        } catch (Throwable th) {
            obtain2.recycle();
            obtain.recycle();
            throw th;
        }
    }

    public final Bundle getExtras() {
        Parcel obtain = Parcel.obtain();
        Parcel obtain2 = Parcel.obtain();
        try {
            obtain.writeInterfaceToken(IMediaSession.DESCRIPTOR);
            if (!this.c.transact(31, obtain, obtain2, 0)) {
                int i = uh8.d;
            }
            obtain2.readException();
            return obtain2.readInt() != 0 ? (Bundle) Bundle.CREATOR.createFromParcel(obtain2) : null;
        } finally {
            obtain2.recycle();
            obtain.recycle();
        }
    }

    public final long getFlags() {
        Parcel obtain = Parcel.obtain();
        Parcel obtain2 = Parcel.obtain();
        try {
            obtain.writeInterfaceToken(IMediaSession.DESCRIPTOR);
            if (!this.c.transact(9, obtain, obtain2, 0)) {
                int i = uh8.d;
            }
            obtain2.readException();
            return obtain2.readLong();
        } finally {
            obtain2.recycle();
            obtain.recycle();
        }
    }

    public final hd8 getMetadata() {
        Parcel obtain = Parcel.obtain();
        Parcel obtain2 = Parcel.obtain();
        try {
            obtain.writeInterfaceToken(IMediaSession.DESCRIPTOR);
            if (!this.c.transact(27, obtain, obtain2, 0)) {
                int i = uh8.d;
            }
            obtain2.readException();
            return obtain2.readInt() != 0 ? hd8.CREATOR.createFromParcel(obtain2) : null;
        } finally {
            obtain2.recycle();
            obtain.recycle();
        }
    }

    public final String getPackageName() {
        Parcel obtain = Parcel.obtain();
        Parcel obtain2 = Parcel.obtain();
        try {
            obtain.writeInterfaceToken(IMediaSession.DESCRIPTOR);
            if (!this.c.transact(6, obtain, obtain2, 0)) {
                int i = uh8.d;
            }
            obtain2.readException();
            return obtain2.readString();
        } finally {
            obtain2.recycle();
            obtain.recycle();
        }
    }

    public final i3b getPlaybackState() {
        Parcel obtain = Parcel.obtain();
        Parcel obtain2 = Parcel.obtain();
        try {
            obtain.writeInterfaceToken(IMediaSession.DESCRIPTOR);
            if (!this.c.transact(28, obtain, obtain2, 0)) {
                int i = uh8.d;
            }
            obtain2.readException();
            return obtain2.readInt() != 0 ? i3b.CREATOR.createFromParcel(obtain2) : null;
        } finally {
            obtain2.recycle();
            obtain.recycle();
        }
    }

    public final List getQueue() {
        Parcel obtain = Parcel.obtain();
        Parcel obtain2 = Parcel.obtain();
        try {
            obtain.writeInterfaceToken(IMediaSession.DESCRIPTOR);
            if (!this.c.transact(29, obtain, obtain2, 0)) {
                int i = uh8.d;
            }
            obtain2.readException();
            return obtain2.createTypedArrayList(yh8.CREATOR);
        } finally {
            obtain2.recycle();
            obtain.recycle();
        }
    }

    public final CharSequence getQueueTitle() {
        Parcel obtain = Parcel.obtain();
        Parcel obtain2 = Parcel.obtain();
        try {
            obtain.writeInterfaceToken(IMediaSession.DESCRIPTOR);
            if (!this.c.transact(30, obtain, obtain2, 0)) {
                int i = uh8.d;
            }
            obtain2.readException();
            return obtain2.readInt() != 0 ? (CharSequence) TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(obtain2) : null;
        } finally {
            obtain2.recycle();
            obtain.recycle();
        }
    }

    public final int getRatingType() {
        Parcel obtain = Parcel.obtain();
        Parcel obtain2 = Parcel.obtain();
        try {
            obtain.writeInterfaceToken(IMediaSession.DESCRIPTOR);
            if (!this.c.transact(32, obtain, obtain2, 0)) {
                int i = uh8.d;
            }
            obtain2.readException();
            return obtain2.readInt();
        } finally {
            obtain2.recycle();
            obtain.recycle();
        }
    }

    public final int getRepeatMode() {
        Parcel obtain = Parcel.obtain();
        Parcel obtain2 = Parcel.obtain();
        try {
            obtain.writeInterfaceToken(IMediaSession.DESCRIPTOR);
            if (!this.c.transact(37, obtain, obtain2, 0)) {
                int i = uh8.d;
            }
            obtain2.readException();
            return obtain2.readInt();
        } finally {
            obtain2.recycle();
            obtain.recycle();
        }
    }

    public final int getShuffleMode() {
        Parcel obtain = Parcel.obtain();
        Parcel obtain2 = Parcel.obtain();
        try {
            obtain.writeInterfaceToken(IMediaSession.DESCRIPTOR);
            if (!this.c.transact(47, obtain, obtain2, 0)) {
                int i = uh8.d;
            }
            obtain2.readException();
            return obtain2.readInt();
        } finally {
            obtain2.recycle();
            obtain.recycle();
        }
    }

    public final upa getVolumeAttributes() {
        Parcel obtain = Parcel.obtain();
        Parcel obtain2 = Parcel.obtain();
        try {
            obtain.writeInterfaceToken(IMediaSession.DESCRIPTOR);
            if (!this.c.transact(10, obtain, obtain2, 0)) {
                int i = uh8.d;
            }
            obtain2.readException();
            return obtain2.readInt() != 0 ? upa.CREATOR.createFromParcel(obtain2) : null;
        } finally {
            obtain2.recycle();
            obtain.recycle();
        }
    }

    public final boolean isCaptioningEnabled() {
        Parcel obtain = Parcel.obtain();
        Parcel obtain2 = Parcel.obtain();
        try {
            obtain.writeInterfaceToken(IMediaSession.DESCRIPTOR);
            boolean z = false;
            if (!this.c.transact(45, obtain, obtain2, 0)) {
                int i = uh8.d;
            }
            obtain2.readException();
            if (obtain2.readInt() != 0) {
                z = true;
            }
            return z;
        } finally {
            obtain2.recycle();
            obtain.recycle();
        }
    }

    public final void k0(ja8 ja8) {
        Parcel obtain = Parcel.obtain();
        Parcel obtain2 = Parcel.obtain();
        try {
            obtain.writeInterfaceToken(IMediaSession.DESCRIPTOR);
            if (ja8 != null) {
                obtain.writeInt(1);
                ja8.writeToParcel(obtain, 0);
            } else {
                obtain.writeInt(0);
            }
            if (!this.c.transact(43, obtain, obtain2, 0)) {
                int i = uh8.d;
            }
            obtain2.readException();
            obtain2.recycle();
            obtain.recycle();
        } catch (Throwable th) {
            obtain2.recycle();
            obtain.recycle();
            throw th;
        }
    }

    public final void next() {
        Parcel obtain = Parcel.obtain();
        Parcel obtain2 = Parcel.obtain();
        try {
            obtain.writeInterfaceToken(IMediaSession.DESCRIPTOR);
            if (!this.c.transact(20, obtain, obtain2, 0)) {
                int i = uh8.d;
            }
            obtain2.readException();
        } finally {
            obtain2.recycle();
            obtain.recycle();
        }
    }

    public final void pause() {
        Parcel obtain = Parcel.obtain();
        Parcel obtain2 = Parcel.obtain();
        try {
            obtain.writeInterfaceToken(IMediaSession.DESCRIPTOR);
            if (!this.c.transact(18, obtain, obtain2, 0)) {
                int i = uh8.d;
            }
            obtain2.readException();
        } finally {
            obtain2.recycle();
            obtain.recycle();
        }
    }

    public final void play() {
        Parcel obtain = Parcel.obtain();
        Parcel obtain2 = Parcel.obtain();
        try {
            obtain.writeInterfaceToken(IMediaSession.DESCRIPTOR);
            if (!this.c.transact(13, obtain, obtain2, 0)) {
                int i = uh8.d;
            }
            obtain2.readException();
        } finally {
            obtain2.recycle();
            obtain.recycle();
        }
    }

    public final void playFromMediaId(String str, Bundle bundle) {
        Parcel obtain = Parcel.obtain();
        Parcel obtain2 = Parcel.obtain();
        try {
            obtain.writeInterfaceToken(IMediaSession.DESCRIPTOR);
            obtain.writeString(str);
            if (bundle != null) {
                obtain.writeInt(1);
                bundle.writeToParcel(obtain, 0);
            } else {
                obtain.writeInt(0);
            }
            if (!this.c.transact(14, obtain, obtain2, 0)) {
                int i = uh8.d;
            }
            obtain2.readException();
            obtain2.recycle();
            obtain.recycle();
        } catch (Throwable th) {
            obtain2.recycle();
            obtain.recycle();
            throw th;
        }
    }

    public final void playFromSearch(String str, Bundle bundle) {
        Parcel obtain = Parcel.obtain();
        Parcel obtain2 = Parcel.obtain();
        try {
            obtain.writeInterfaceToken(IMediaSession.DESCRIPTOR);
            obtain.writeString(str);
            if (bundle != null) {
                obtain.writeInt(1);
                bundle.writeToParcel(obtain, 0);
            } else {
                obtain.writeInt(0);
            }
            if (!this.c.transact(15, obtain, obtain2, 0)) {
                int i = uh8.d;
            }
            obtain2.readException();
            obtain2.recycle();
            obtain.recycle();
        } catch (Throwable th) {
            obtain2.recycle();
            obtain.recycle();
            throw th;
        }
    }

    public final void playFromUri(Uri uri, Bundle bundle) {
        Parcel obtain = Parcel.obtain();
        Parcel obtain2 = Parcel.obtain();
        try {
            obtain.writeInterfaceToken(IMediaSession.DESCRIPTOR);
            if (uri != null) {
                obtain.writeInt(1);
                uri.writeToParcel(obtain, 0);
            } else {
                obtain.writeInt(0);
            }
            if (bundle != null) {
                obtain.writeInt(1);
                bundle.writeToParcel(obtain, 0);
            } else {
                obtain.writeInt(0);
            }
            if (!this.c.transact(16, obtain, obtain2, 0)) {
                int i = uh8.d;
            }
            obtain2.readException();
            obtain2.recycle();
            obtain.recycle();
        } catch (Throwable th) {
            obtain2.recycle();
            obtain.recycle();
            throw th;
        }
    }

    public final void prepare() {
        Parcel obtain = Parcel.obtain();
        Parcel obtain2 = Parcel.obtain();
        try {
            obtain.writeInterfaceToken(IMediaSession.DESCRIPTOR);
            if (!this.c.transact(33, obtain, obtain2, 0)) {
                int i = uh8.d;
            }
            obtain2.readException();
        } finally {
            obtain2.recycle();
            obtain.recycle();
        }
    }

    public final void prepareFromMediaId(String str, Bundle bundle) {
        Parcel obtain = Parcel.obtain();
        Parcel obtain2 = Parcel.obtain();
        try {
            obtain.writeInterfaceToken(IMediaSession.DESCRIPTOR);
            obtain.writeString(str);
            if (bundle != null) {
                obtain.writeInt(1);
                bundle.writeToParcel(obtain, 0);
            } else {
                obtain.writeInt(0);
            }
            if (!this.c.transact(34, obtain, obtain2, 0)) {
                int i = uh8.d;
            }
            obtain2.readException();
            obtain2.recycle();
            obtain.recycle();
        } catch (Throwable th) {
            obtain2.recycle();
            obtain.recycle();
            throw th;
        }
    }

    public final void prepareFromSearch(String str, Bundle bundle) {
        Parcel obtain = Parcel.obtain();
        Parcel obtain2 = Parcel.obtain();
        try {
            obtain.writeInterfaceToken(IMediaSession.DESCRIPTOR);
            obtain.writeString(str);
            if (bundle != null) {
                obtain.writeInt(1);
                bundle.writeToParcel(obtain, 0);
            } else {
                obtain.writeInt(0);
            }
            if (!this.c.transact(35, obtain, obtain2, 0)) {
                int i = uh8.d;
            }
            obtain2.readException();
            obtain2.recycle();
            obtain.recycle();
        } catch (Throwable th) {
            obtain2.recycle();
            obtain.recycle();
            throw th;
        }
    }

    public final void prepareFromUri(Uri uri, Bundle bundle) {
        Parcel obtain = Parcel.obtain();
        Parcel obtain2 = Parcel.obtain();
        try {
            obtain.writeInterfaceToken(IMediaSession.DESCRIPTOR);
            if (uri != null) {
                obtain.writeInt(1);
                uri.writeToParcel(obtain, 0);
            } else {
                obtain.writeInt(0);
            }
            if (bundle != null) {
                obtain.writeInt(1);
                bundle.writeToParcel(obtain, 0);
            } else {
                obtain.writeInt(0);
            }
            if (!this.c.transact(36, obtain, obtain2, 0)) {
                int i = uh8.d;
            }
            obtain2.readException();
            obtain2.recycle();
            obtain.recycle();
        } catch (Throwable th) {
            obtain2.recycle();
            obtain.recycle();
            throw th;
        }
    }

    public final void previous() {
        Parcel obtain = Parcel.obtain();
        Parcel obtain2 = Parcel.obtain();
        try {
            obtain.writeInterfaceToken(IMediaSession.DESCRIPTOR);
            if (!this.c.transact(21, obtain, obtain2, 0)) {
                int i = uh8.d;
            }
            obtain2.readException();
        } finally {
            obtain2.recycle();
            obtain.recycle();
        }
    }

    public final void rewind() {
        Parcel obtain = Parcel.obtain();
        Parcel obtain2 = Parcel.obtain();
        try {
            obtain.writeInterfaceToken(IMediaSession.DESCRIPTOR);
            if (!this.c.transact(23, obtain, obtain2, 0)) {
                int i = uh8.d;
            }
            obtain2.readException();
        } finally {
            obtain2.recycle();
            obtain.recycle();
        }
    }

    public final void seekTo(long j) {
        Parcel obtain = Parcel.obtain();
        Parcel obtain2 = Parcel.obtain();
        try {
            obtain.writeInterfaceToken(IMediaSession.DESCRIPTOR);
            obtain.writeLong(j);
            if (!this.c.transact(24, obtain, obtain2, 0)) {
                int i = uh8.d;
            }
            obtain2.readException();
        } finally {
            obtain2.recycle();
            obtain.recycle();
        }
    }

    public final void sendCustomAction(String str, Bundle bundle) {
        Parcel obtain = Parcel.obtain();
        Parcel obtain2 = Parcel.obtain();
        try {
            obtain.writeInterfaceToken(IMediaSession.DESCRIPTOR);
            obtain.writeString(str);
            if (bundle != null) {
                obtain.writeInt(1);
                bundle.writeToParcel(obtain, 0);
            } else {
                obtain.writeInt(0);
            }
            if (!this.c.transact(26, obtain, obtain2, 0)) {
                int i = uh8.d;
            }
            obtain2.readException();
            obtain2.recycle();
            obtain.recycle();
        } catch (Throwable th) {
            obtain2.recycle();
            obtain.recycle();
            throw th;
        }
    }

    public final boolean sendMediaButton(KeyEvent keyEvent) {
        Parcel obtain = Parcel.obtain();
        Parcel obtain2 = Parcel.obtain();
        try {
            obtain.writeInterfaceToken(IMediaSession.DESCRIPTOR);
            boolean z = true;
            if (keyEvent != null) {
                obtain.writeInt(1);
                keyEvent.writeToParcel(obtain, 0);
            } else {
                obtain.writeInt(0);
            }
            if (!this.c.transact(2, obtain, obtain2, 0)) {
                int i = uh8.d;
            }
            obtain2.readException();
            if (obtain2.readInt() == 0) {
                z = false;
            }
            obtain2.recycle();
            obtain.recycle();
            return z;
        } catch (Throwable th) {
            obtain2.recycle();
            obtain.recycle();
            throw th;
        }
    }

    public final void setPlaybackSpeed(float f) {
        Parcel obtain = Parcel.obtain();
        Parcel obtain2 = Parcel.obtain();
        try {
            obtain.writeInterfaceToken(IMediaSession.DESCRIPTOR);
            obtain.writeFloat(f);
            if (!this.c.transact(49, obtain, obtain2, 0)) {
                int i = uh8.d;
            }
            obtain2.readException();
        } finally {
            obtain2.recycle();
            obtain.recycle();
        }
    }

    public final void setRepeatMode(int i) {
        Parcel obtain = Parcel.obtain();
        Parcel obtain2 = Parcel.obtain();
        try {
            obtain.writeInterfaceToken(IMediaSession.DESCRIPTOR);
            obtain.writeInt(i);
            if (!this.c.transact(39, obtain, obtain2, 0)) {
                int i2 = uh8.d;
            }
            obtain2.readException();
        } finally {
            obtain2.recycle();
            obtain.recycle();
        }
    }

    public final void setShuffleMode(int i) {
        Parcel obtain = Parcel.obtain();
        Parcel obtain2 = Parcel.obtain();
        try {
            obtain.writeInterfaceToken(IMediaSession.DESCRIPTOR);
            obtain.writeInt(i);
            if (!this.c.transact(48, obtain, obtain2, 0)) {
                int i2 = uh8.d;
            }
            obtain2.readException();
        } finally {
            obtain2.recycle();
            obtain.recycle();
        }
    }

    public final void setVolumeTo(int i, int i2, String str) {
        Parcel obtain = Parcel.obtain();
        Parcel obtain2 = Parcel.obtain();
        try {
            obtain.writeInterfaceToken(IMediaSession.DESCRIPTOR);
            obtain.writeInt(i);
            obtain.writeInt(i2);
            obtain.writeString(str);
            if (!this.c.transact(12, obtain, obtain2, 0)) {
                int i3 = uh8.d;
            }
            obtain2.readException();
        } finally {
            obtain2.recycle();
            obtain.recycle();
        }
    }

    public final void skipToQueueItem(long j) {
        Parcel obtain = Parcel.obtain();
        Parcel obtain2 = Parcel.obtain();
        try {
            obtain.writeInterfaceToken(IMediaSession.DESCRIPTOR);
            obtain.writeLong(j);
            if (!this.c.transact(17, obtain, obtain2, 0)) {
                int i = uh8.d;
            }
            obtain2.readException();
        } finally {
            obtain2.recycle();
            obtain.recycle();
        }
    }

    public final void stop() {
        Parcel obtain = Parcel.obtain();
        Parcel obtain2 = Parcel.obtain();
        try {
            obtain.writeInterfaceToken(IMediaSession.DESCRIPTOR);
            if (!this.c.transact(19, obtain, obtain2, 0)) {
                int i = uh8.d;
            }
            obtain2.readException();
        } finally {
            obtain2.recycle();
            obtain.recycle();
        }
    }

    public final void t0(ja8 ja8, int i) {
        Parcel obtain = Parcel.obtain();
        Parcel obtain2 = Parcel.obtain();
        try {
            obtain.writeInterfaceToken(IMediaSession.DESCRIPTOR);
            if (ja8 != null) {
                obtain.writeInt(1);
                ja8.writeToParcel(obtain, 0);
            } else {
                obtain.writeInt(0);
            }
            obtain.writeInt(i);
            if (!this.c.transact(42, obtain, obtain2, 0)) {
                int i2 = uh8.d;
            }
            obtain2.readException();
            obtain2.recycle();
            obtain.recycle();
        } catch (Throwable th) {
            obtain2.recycle();
            obtain.recycle();
            throw th;
        }
    }
}
