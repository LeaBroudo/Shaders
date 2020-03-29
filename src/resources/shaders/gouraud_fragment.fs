#version 330

in vec4 VertexColor;
out vec4 fragColor;

void main() 
{
    fragColor = VertexColor;
}