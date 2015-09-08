require "../src/silly.rb"
require "minitest/autorun"

class TestSilly < Minitest::Test 
  
  def test_silly
    silly = Silly.new()
    assert_equal(silly.name,"I am a Silly object!")
  end

end
