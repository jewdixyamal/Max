package defpackage;

import java.nio.ByteBuffer;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;
import org.webrtc.DataChannel;

/* renamed from: e24  reason: default package */
public final class e24 {
    public final DataChannel a;
    public final a4c b;
    public final CopyOnWriteArrayList c = new CopyOnWriteArrayList();
    public final CopyOnWriteArrayList d = new CopyOnWriteArrayList();
    public final CopyOnWriteArrayList e = new CopyOnWriteArrayList();

    public e24(DataChannel dataChannel, a4c a4c) {
        this.a = dataChannel;
        this.b = a4c;
        dataChannel.registerObserver(new imc((Object) this, 14, (Object) dataChannel));
    }

    public final void a(uoc uoc) {
        if (uoc != null) {
            this.d.add(uoc);
            return;
        }
        throw new IllegalArgumentException("Illegal 'listener' value: null");
    }

    public final boolean b() {
        return this.a.state() == DataChannel.State.OPEN;
    }

    public final void c(uoc uoc) {
        if (uoc != null) {
            this.d.remove(uoc);
            return;
        }
        throw new IllegalArgumentException("Illegal 'listener' value: null");
    }

    public final void d(ByteBuffer... byteBufferArr) {
        Iterator it = this.d.iterator();
        while (it.hasNext()) {
            try {
                ((uoc) it.next()).getClass();
            } catch (Throwable th) {
                this.b.reportException("DataChannelRtcTransport", "rtc.datachannel.listen.send", new Exception(th));
            }
        }
        this.a.sendMultiple(true, byteBufferArr);
    }

    public final boolean e(int i, byte[] bArr) {
        if (bArr != null) {
            Iterator it = this.d.iterator();
            while (it.hasNext()) {
                try {
                    ((uoc) it.next()).getClass();
                    ByteBuffer.wrap(bArr);
                } catch (Throwable th) {
                    this.b.reportException("DataChannelRtcTransport", "rtc.datachannel.listen.send", new Exception(th));
                }
            }
            return this.a.send(new DataChannel.Buffer(ByteBuffer.wrap(bArr), i == 2));
        }
        throw new IllegalArgumentException("Illegal 'command' value: null");
    }
}
