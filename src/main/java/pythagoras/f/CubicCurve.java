//
// $Id$

package pythagoras.f;

import java.io.Serializable;

/**
 * Represents a cubic curve.
 */
public class CubicCurve extends AbstractCubicCurve implements Serializable
{
    /** The x-coordinate of the start of this curve. */
    public float x1;

    /** The y-coordinate of the start of this curve. */
    public float y1;

    /** The x-coordinate of the first control point. */
    public float ctrlx1;

    /** The y-coordinate of the first control point. */
    public float ctrly1;

    /** The x-coordinate of the second control point. */
    public float ctrlx2;

    /** The x-coordinate of the second control point. */
    public float ctrly2;

    /** The x-coordinate of the end of this curve. */
    public float x2;

    /** The y-coordinate of the end of this curve. */
    public float y2;

    /**
     * Creates a cubic curve with all points at (0,0).
     */
    public CubicCurve () {
    }

    /**
     * Creates a cubic curve with the specified start, control, and end points.
     */
    public CubicCurve (float x1, float y1, float ctrlx1, float ctrly1,
                       float ctrlx2, float ctrly2, float x2, float y2) {
        setCurve(x1, y1, ctrlx1, ctrly1, ctrlx2, ctrly2, x2, y2);
    }

    /**
     * Configures the start, control and end points for this curve.
     */
    public void setCurve (float x1, float y1, float ctrlx1, float ctrly1, float ctrlx2,
                          float ctrly2, float x2, float y2) {
        this.x1 = x1;
        this.y1 = y1;
        this.ctrlx1 = ctrlx1;
        this.ctrly1 = ctrly1;
        this.ctrlx2 = ctrlx2;
        this.ctrly2 = ctrly2;
        this.x2 = x2;
        this.y2 = y2;
    }

    /**
     * Configures the start, control and end points for this curve.
     */
    public void setCurve (IPoint p1, IPoint cp1, IPoint cp2, IPoint p2) {
        setCurve(p1.getX(), p1.getY(), cp1.getX(), cp1.getY(),
                 cp2.getX(), cp2.getY(), p2.getX(), p2.getY());
    }

    /**
     * Configures the start, control and end points for this curve, using the values at the
     * specified offset in the {@link coords} array.
     */
    public void setCurve (float[] coords, int offset) {
        setCurve(coords[offset + 0], coords[offset + 1], coords[offset + 2], coords[offset + 3],
                 coords[offset + 4], coords[offset + 5], coords[offset + 6], coords[offset + 7]);
    }

    /**
     * Configures the start, control and end points for this curve, using the values at the
     * specified offset in the {@link points} array.
     */
    public void setCurve (IPoint[] points, int offset) {
        setCurve(points[offset + 0].getX(), points[offset + 0].getY(),
                 points[offset + 1].getX(), points[offset + 1].getY(),
                 points[offset + 2].getX(), points[offset + 2].getY(),
                 points[offset + 3].getX(), points[offset + 3].getY());
    }

    /**
     * Configures the start, control and end points for this curve to be the same as the supplied
     * curve.
     */
    public void setCurve (ICubicCurve curve) {
        setCurve(curve.getX1(), curve.getY1(), curve.getCtrlX1(), curve.getCtrlY1(),
                 curve.getCtrlX2(), curve.getCtrlY2(), curve.getX2(), curve.getY2());
    }

    @Override // from interface ICubicCurve
    public float getX1 () {
        return x1;
    }

    @Override // from interface ICubicCurve
    public float getY1 () {
        return y1;
    }

    @Override // from interface ICubicCurve
    public float getCtrlX1 () {
        return ctrlx1;
    }

    @Override // from interface ICubicCurve
    public float getCtrlY1 () {
        return ctrly1;
    }

    @Override // from interface ICubicCurve
    public float getCtrlX2 () {
        return ctrlx2;
    }

    @Override // from interface ICubicCurve
    public float getCtrlY2 () {
        return ctrly2;
    }

    @Override // from interface ICubicCurve
    public float getX2 () {
        return x2;
    }

    @Override // from interface ICubicCurve
    public float getY2 () {
        return y2;
    }
}
