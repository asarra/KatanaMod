#include frex:shaders/api/fragment.glsl
#include frex:shaders/lib/math.glsl

// The name of this method is special - Canvas will call it for each fragment associated with your shader
void frx_startFragment(inout frx_FragmentData fragData) {
	// modify appearance where texture is lighter in color
	if (fragData.spriteColor.rgba == vec4(1.0, 0.0, 0.0, 1.0)) {

		// mix with the texture colors
		//fragData.spriteColor = mix(fragData.spriteColor, vec4(1, 1, 1, 1), 0.5);

		// make these fragments fully lit
		fragData.emissivity = 0.75;
		fragData.ao = false;
		fragData.diffuse = false;
	}
}